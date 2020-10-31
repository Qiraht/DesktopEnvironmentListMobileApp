package com.dicoding.qiraht.recyclerview;

import java.util.ArrayList;

public class ItemsData {
    private static String[] itemNames = {
            "Cinnamon",
            "GNOME",
            "KDE",
            "MATE",
            "Deepin",
            "Pantheon",
            "UKUI",
            "XFCE",
            "Openbox",
            "LXDE"


    };

    private static String[] itemDetails = {
            "Cinnamon adalah sebuah lingkungan desktop bebas dan sumber terbuka untuk X Window System yang berasal daru GNOME 3, tetapi mengikuti metafora desktop tradisional. Cinnamon sendiri adalah proyek fork dari GNOME2, yang dibuat dengan GTK+(C), Javascript dan Python",
            "GNOME adalah lingkungan desktop dan antarmuka grafik pengguna yang berjalan di atas sistem operasi. GNOME secara keseluruhan terdiri dari perangkat lunak bebas dan gratis. GNOME sendiri dibuat menggunakan C, Python, Vala, C++, C#, dan Javascript",
            "KDE atau K Desktop Environment adalah lingkunagan desktop dan platform pengembangan aplikasi yang dibangun dengan toolkit Qt dari TrollTech. Untuk nama Lingkungan Desktopnya adalah KDE Plasma",
            "MATE adalah lingkungan desktop yang merupakan kelanjutan dari GNOME 2. MATE menyediakan sebuah lingkungan desktop yang intuitif dan atraktif menggunakan metafor tradisional untuk sistem operasi Linux dan Unix-like",
            "Deepin Desktop adalah sebuah lingkungan desktop yang dikembangkan menggunakan Toolkit QT. Desktop ini sendiri dikembangkan oleh Wuhan Deepin Technology Co., Ltd. untuk distro Linux Deepin",
            "Pantheon adalah sebuah lingkungan desktop yang dikembangankan oleh tim ElementaryOS. Desktop ini dikembangankan dengan menggunakana Vala dan GTK+",
            "UKUI atau Ubuntu Kylin UI adalah sebuah lingkungan desktop yang dikembangkan oleh tim Ubuntu Kylin dan dibuat khusus untuk Ubuntu Kylin. Desktop ini sendiri dibuat dengan toolkit Qt",
            "Xfce adalah sebuah lingkungan desktop yang dibuat untuk Linux atau Unix-like sistem operasi. Xfce memiliki tujuan untuk memberikan sebuah lingkuangan yang cepat dan ringan dalam system resource yang mudah digunakan. Desktop ini dibuat dengan C",
            "Openbox adalah sebuah stacking window manager yang sangat powerful. Openbox bisa berjalan sendiri sebagai window manager atau terintegrasi dengan lingkungan desktop lainnya seperti KDE atau Xfce",
            "LXDE atau Lightweight X11 Desktop Environment adalah sebuah lingkungan dekstop yang ringan dan cepat. LXDE sendiri berbasis dari project Openbox. Adpun LXDE yang terbuat dengan toolkit Qt yang dinamakan dengan LXQt"
    };

    private static String[] itemLink = {
            "https://github.com/linuxmint/Cinnamon",
            "https://gitlab.gnome.org/GNOME",
            "https://invent.kde.org/plasma",
            "https://git.mate-desktop.org/",
            "https://github.com/linuxdeepin/dde-desktop",
            "https://github.com/elementary",
            "https://github.com/ukui/ukui-desktop-environment",
            "https://gitlab.xfce.org/xfce",
            "http://git.openbox.org/?p=dana/openbox.git;a=summary",
            "https://github.com/lxde",
    };

    private static int[] itemImages ={
            R.drawable.cinnamon,
            R.drawable.gnome,
            R.drawable.kde,
            R.drawable.mate,
            R.drawable.deepin,
            R.drawable.pantheon,
            R.drawable.ukui,
            R.drawable.xfce,
            R.drawable.openbox,
            R.drawable.lxde
    };

    static ArrayList<Item> getListData() {
        ArrayList<Item> list = new ArrayList<>();
        for (int postion = 0; postion < itemNames.length; postion++) {
            Item item = new Item();
            item.setName(itemNames[postion]);
            item.setDetail(itemDetails[postion]);
            item.setPhoto(itemImages[postion]);
            item.setLink(itemLink[postion]);
            list.add(item);
        }
        return list;
    }
}
