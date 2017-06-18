# CustomSkinLoader  
## What's this?  
Custom Skin Loader mod for Minecraft.  
You can use it to load any skin from any website.  
  
## Download  
Build Server : [Infinity Studio CI](https://ci.infstudio.net/job/CustomSkinLoader/)  
[![Build Status](https://ci.infstudio.net/job/CustomSkinLoader/badge/icon)](https://ci.infstudio.net/job/CustomSkinLoader/)  
Release Page : [MCBBS](http://www.mcbbs.net/thread-269807-1-1.html)  
  
## Feature  
### Plenty of Skin Load API Support and Customizable Skin Load List  
Skin Load API Supported:  
- [Mojang API](http://wiki.vg/Mojang_API)  
- [CustomSkinAPI](https://github.com/xfl03/CustomSkinLoaderAPI/tree/master/CustomSkinAPI)  
- CustomSkinAPIPlus (Test Only)  
- [UniSkinAPI](https://github.com/RecursiveG/UniSkinServer/tree/master/doc)  
- Legacy  
- ElfSkin (Self-made API, Test Only)  

You can use this feature to customize your skin load list so as to load from any skin server you want.  
If you are the owner of skin server, you can use CustomSkinLoader to load skin from your server if one of the api has been actualized.  
  
### HD Skins Support  
Even though there is no Optifine or MCPatcher, CustomSkinLoader has fix this problem.  
You can easily to get a better view in skin.  
  
### Skull Support  
Fixed skull load bug.  
Dynamic skull supported.  
  
### Profile Cache  
- Decrease frenquency of using network.  
- Meanwhile,you can still load profile without network.  

*Should be open in configratulation file.  
  
### Local Skin  
Load skin without skin server.  
Furthermore, by using this function you can preview your skin in game and even change default skin and model.  
You can load local skin by using any API(excluding MojangAPI).  
*While using default configratulation, just put skin into `.minecraft/CustomSkinLoader/LocalSkin/(skin|cape)s/{USERNAME}.png`.  
   
### Extra List  
A json file generated by supported skin server.  
To add server to load list, users just need to put file into `.minecraft/CustomSkinLoader/ExtraList` .  
  
### Transparent Skin Support  
The problem of rendering incorrect texture has been fixed.  
  
## Default Load List  
- [Mojang](http://www.minecraft.net/) (Mojang API)
- [Blessing Skin](http://123.57.132.134/) (CustomSkinAPI)
- [OneSkin](http://fleey.cn/skin/) (CustomSkinAPI)
- SkinMe (UniSkinAPI)  
- LocalSkin (Legacy)  
If you want to apply to add other skin server to default list, please go to [issue](https://github.com/JLChnToZ/MCCustomSkinLoader/issues).  
  
## To Skin Server Owner  
CustomSkinLoader is designed for #CustomSkinLoader  
## What's this?  
Custom Skin Loader mod for Minecraft.  
You can use it to load any skin from any website.  
  
## Download  
Build Server : [Infinity Studio CI](https://ci.infstudio.net/job/CustomSkinLoader/)  
[![Build Status](https://ci.infstudio.net/job/CustomSkinLoader/badge/icon)](https://ci.infstudio.net/job/CustomSkinLoader/)  
Release Page : [MCBBS](http://www.mcbbs.net/thread-269807-1-1.html)  
  
## Feature  
### Plenty of Skin Load API Support and Customizable Skin Load List  
Skin Load API Supported:  
- [Mojang API](http://wiki.vg/Mojang_API)  
- [CustomSkinAPI](https://github.com/xfl03/CustomSkinLoaderAPI/tree/master/CustomSkinAPI)  
- CustomSkinAPIPlus (Test Only)  
- [UniSkinAPI](https://github.com/RecursiveG/UniSkinServer/tree/master/doc)  
- Legacy  
- ElfSkin (Self-made API, Test Only)  

You can use this feature to customize your skin load list so as to load from any skin server you want.  
If you are the owner of skin server, you can use CustomSkinLoader to load skin from your server if one of the api has been actualized.  
  
### HD Skins Support  
Even though there is no Optifine or MCPatcher, CustomSkinLoader has fix this problem.  
You can easily to get a better view in skin.  
  
### Skull Support  
Fixed skull load bug.  
Dynamic skull supported.  
  
### Profile Cache  
- Decrease frenquency of using network.  
- Meanwhile,you can still load profile without network.  
*Should be open in configratulation file.  
  
### Local Skin  
Load skin without skin server.  
Furthermore, by using this function you can preview your skin in game and even change default skin and model.  
You can load local skin by using any API(excluding MojangAPI).  
*While using default configratulation, just put skin into `.minecraft/CustomSkinLoader/LocalSkin/(skin|cape)s/{USERNAME}.png`.  
   
### Extra List  
A json file generated by supported skin server.  
To add server to load list, users just need to put file into `.minecraft/CustomSkinLoader/ExtraList` .  
  
### Transparent Skin Support  
The problem of rendering incorrect texture has been fixed.  
  
## Default Load List  
- [Mojang](http://www.minecraft.net/) (Mojang API)
- [Blessing Skin](http://123.57.132.134/) (CustomSkinAPI)
- [OneSkin](http://fleey.cn/skin/) (CustomSkinAPI)
- SkinMe (UniSkinAPI)  
- LocalSkin (Legacy)  

If you want to apply to add other skin server to default list, please go to [issue](https://github.com/JLChnToZ/MCCustomSkinLoader/issues).  
  
## To Skin Server Owner  
CustomSkinLoader is designed for loading from any server, which makes it complex.  
It's not a good idea to refer to CustomSkinLoader's source code to develop your own skin mod.  
It's recommended to use CustomSkinLoader for your server directly.  
Furthermore, you can add your server to 'Default Load List'.  
You also can use 'ExtraList' which makes it easier for user to adds your server into load list.  
  
## Copyright & LICENSE  
### Binary File  
You could not modify binary file.  
Feel free to use and share this mod and unmodified file in anyway like modpack.  
When using in modpack, you must put 'CustomSkinLoader' in mod list.   
You could not repost this mod to any website without permission.  
You could not earn money with this mod excluding modpack.  
### Source Code  
#### Package 'customskinloader'  
Including some code from 
- [AsteriskTeam/TabIconHackForge](http://git.oschina.net/AsteriskTeam/TabIconHackForge) (GPLv3)
- [RecursiveG/UniSkinMod](https://github.com/RecursiveG/UniSkinMod) (GPLv3)  
  
Copyright(C) 2013-2017 JLChnToZ xfl03  

    This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
    
    This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
    
GPLv3: http://www.gnu.org/licenses/gpl.html  
You should change the name of package to avoid others' misunderstanding.  loading from any server, which makes it complex.  
It's not a good idea to refer to CustomSkinLoader's source code to develop your own skin mod.  
It's recommended to use CustomSkinLoader for your server directly.  
Furthermore, you can add your server to 'Default Load List'.  
You also can use 'ExtraList' which makes it easier for user to adds your server into load list.  
  
## Copyright & LICENSE  
### Binary File  
You could not modify binary file.  
Feel free to use and share this mod and unmodified file in anyway like modpack.  
When using in modpack, you must put 'CustomSkinLoader' in mod list.   
You could not repost this mod to any website without permission.  
You could not earn money with this mod excluding modpack.  
### Source Code  
#### Package 'customskinloader'  
Including some code from 
- [AsteriskTeam/TabIconHackForge](http://git.oschina.net/AsteriskTeam/TabIconHackForge) (GPLv3)
- [RecursiveG/UniSkinMod](https://github.com/RecursiveG/UniSkinMod) (GPLv3)  
  
Copyright(C) 2013-2017 JLChnToZ xfl03  

    This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
    
    This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
    
GPLv3: http://www.gnu.org/licenses/gpl.html  
You should change the name of package to avoid others' misunderstanding.  
