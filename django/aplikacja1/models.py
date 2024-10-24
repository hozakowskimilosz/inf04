from django.db import models

# Create your models here.
class Czlowiek (models.Model):
    imie = models.CharField(max_length=30,
    unique=False, null=False, blank=False, verbose_name="Imie")
    nazwisko = models.CharField(max_length=40,
    unique=False, null=False, blank=False, verbose_name="Nazwisko", default="")