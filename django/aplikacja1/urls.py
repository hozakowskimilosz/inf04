from django.urls import path
from aplikacja1 import views

app_name = 'aplikacja1'
urlpatterns = [
    path('index/',views.index,name="index"),
    path('index2/',views.index2,name="index2"),
    path('index3/',views.index3,name="index3"),
    path('index4/<int:id>/',views.szegoly,name="szegoly"),
    path('delete/<int:id>/',views.delete,name="delete"),
    path('create/',views.create,name="create"),
    path('update/<int:id>/',views.update,name="update"),
    path('api_lista/', views.getList, name="api_lista"),
    path('api_detail/<int:id>/', views.getOne, name="api_detail"),
    path('api_delete/<int:id>/', views.apiDelete, name="api_delete"),
    path('api_create/', views.apiCreate, name="api_create")

] 