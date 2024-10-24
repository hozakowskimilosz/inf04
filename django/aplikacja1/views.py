from django.shortcuts import render,redirect
from .models import Czlowiek
from .forms import CzlowiekForm

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