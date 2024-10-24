from django import forms
from .models import Czlowiek

class CzlowiekForm(forms.ModelForm):
    class Meta:
        model = Czlowiek
        fields = '__all__'