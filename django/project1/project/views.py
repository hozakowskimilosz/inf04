from django.shortcuts import render
from .models import Czlowiek

# Create your views here.
def index(request, *args, **kwargs):
    list = ['1', '2', '3', '5']
    x = 'aaa'
    y = ';lrjhgorethg'

    return render(request, 'add.html', {'x': x, 'y': y, 'list': list})

def index2(request, *args, **kwargs):
    list = ['halo', 'elo', 'hej', 'siema']
    x = 'aaa'
    y = ';lrjhgorethg'

    return render(request, 'view2.html', {'x': x, 'y': y, 'list': list})

def czlowiek(request, *args, **kwargs):
    czlowiekLista = Czlowiek.objects.all()

    return render(request, 'view3.html', {'list': czlowiekLista})
