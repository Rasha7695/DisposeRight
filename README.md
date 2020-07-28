# DisposeRight
DisposeRight is an Android app that classifies a picture of an item into the trash, the recycling, the compost or the undefined category. The goal of this app is to promote sustainability and eco-friendly waste management.

## How does it work
<img src="/Images/demo2.jpg" height=400>  <img src="/Images/demo1.jpg" height=400>

_Capture Picture_ is where an image is taken and classified. 
_When to dispose?_ gives the schedule for garbage, recycling and compost collection based on the user's postal code. 
_Where to dispose?_ shows a map and coordinates of ecocenters. 
_General Info_ contains alternative ways to reuse an object.  


## Model
Following the [Transfer Learning for Computer Vision Tutorial](https://pytorch.org/tutorials/beginner/transfer_learning_tutorial.html#load-data), the pretrained ResNet-18 model from the [PyTorch library](https://pytorch.org/docs/stable/torchvision/models.html) was used for the classification task. hyperparameters

## Datasets
The dataset used to train our model contained four classes: trash, recycling, compost and undefined. It was a combination of images from multiple datasets: [sapal6](https://www.kaggle.com/sapal6/waste-classification-data-v2), [garything](https://github.com/garythung/trashnet), [wangziang](https://www.kaggle.com/wangziang/waste-pictures), [TACO](http://tacodataset.org/), [ImageNet](http://image-net.org/download), [SchubertSlySchubert](https://www.kaggle.com/tongpython/cat-and-dog/metadata), [GreatGameDota](https://www.kaggle.com/greatgamedota/ffhq-face-data-set/metadata). The aggregated dataset used can be downloaded [here](https://drive.google.com/file/d/1fXuXGFyijMxHA_8u3n2tXbyaU_mBMybl/view?usp=sharing). 

## App
The application was developed using [Android Studio](https://developer.android.com/studio) with the [PyTorch Android API](https://pytorch.org/mobile/android/).

## About the contributors
[Aurélie Nguyen](https://github.com/aurelie-nguyen), [Rasha Nasri](https://github.com/Rasha7695), [Harshika](https://github.com/Harshika1411) are participants of the 2020 [AI4Good Lab](https://www.ai4goodlab.com/), a 7-week summer training program that starts off with a crash course on machine learning and ends with the development of a project aimed for social good. 
