from django.contrib.auth.models import Group, User
from rest_framework import serializers
from .models import Czlowiek

class CzlowiekSerializer(serializers.HyperlinkedModelSerializer):
    class Meta:
        model = Czlowiek
        fields = ['imie', 'nazwisko', 'id']