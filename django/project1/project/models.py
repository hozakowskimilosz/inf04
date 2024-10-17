from django.db import models

# Create your models here.
class Czlowiek(models.Model):
    imie = models.CharField(max_length=30, unique=False, blank=False, verbose_name='imie')