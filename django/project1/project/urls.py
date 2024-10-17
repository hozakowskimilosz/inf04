from django.contrib import admin
from django.urls import path
from project import views

app_name = 'project'

urlpatterns = [
    path('index/', views.index, name = 'index'),
    path('index2/', views.index2, name = 'index2'),
    path('index3/', views.czlowiek, name = 'czlowiek')
]
