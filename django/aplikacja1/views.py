from django.shortcuts import render,redirect
from .models import Czlowiek
from .forms import CzlowiekForm
from rest_framework.views import APIView
from rest_framework.decorators import api_view
from rest_framework.response import Response
from rest_framework import status
from .serializers import CzlowiekSerializer
from rest_framework import permissions, viewsets

def index(request, *args, **kwargs):
    x= 'aaa'
    y = 'a','b','c','d'
    return render(request,'add.html',{'x':x, 'y':y})

def index2(request, *args, **kwargs):
    a= 'kkk'
    c = 'n','i','g','a'
    return render(request,'test.html',{'a':a, 'c':c})

def index3(request, *args, **kwargs):
    czlowieklista = Czlowiek.objects.all
    return render(request,'osoby.html',{'czlowieklista':czlowieklista})

def szegoly(request, id):
    czlowiek = Czlowiek.objects.get(pk=id)
    return render(request,'czlowiek.html',{'czlowiek':czlowiek})

def create(request):
    myform = CzlowiekForm()
    if(request.method == 'POST'):
        form = CzlowiekForm(request.POST)
        form.save()
        return redirect('aplikacja1:index3')
    
    return render(request,'create.html',{'myform':myform})

def delete(request, id):
    czlowiek = Czlowiek.objects.get(pk = id)

    if(request.method == 'POST'):
        czlowiek.delete()
        return redirect('aplikacja1:index3')

    return render(request, 'delete.html', {'czlowiek': czlowiek})

def update(request, id):
    czlowiek = Czlowiek.objects.get(pk = id)
    myform = CzlowiekForm(instance=czlowiek)

    if(request.method == 'POST'):
        form = CzlowiekForm(request.POST, instance=czlowiek)
        form.save()
        return redirect('aplikacja1:index3')
    
    return render(request,'update.html',{'myform':myform})

@api_view(['GET'])
def getList(request):
    lista = Czlowiek.objects.all()
    serializer = CzlowiekSerializer(lista, many = True)
    return Response(serializer.data, status = status.HTTP_200_OK)

@api_view(['GET'])
def getOne(request, id):
    czlowiek = Czlowiek.objects.get(pk = id)
    serializer = CzlowiekSerializer(czlowiek, many = False)
    return Response(serializer.data, status = status.HTTP_200_OK)

@api_view(['DELETE'])
def apiDelete(request, id):
    czlowiek = Czlowiek.objects.get(pk = id)
    czlowiek.delete()
    return Response(status = status.HTTP_204_NO_CONTENT)

@api_view(['POST'])
def apiCreate(request):
    serializer = CzlowiekSerializer(data=request.data)
    if serializer.is_valid():
        serializer.save()
        return Response(serializer.data, status=status.HTTP_201_CREATED)
    return Response(serializer.erros, status=status.HTTP_400_BAD_REQUEST)

@api_view(['PUT'])
def apiUpdate(request, id):
    czlowiek = Czlowiek.objects.get(pk = id)
    serializer = CzlowiekSerializer(czlowiek, data=request.data)

    if serializer.is_valid():
        serializer.save()
        return Response(serializer.data)

    return Response(serializer.errors, status = status.HTTP_400_BAD_REQUEST)