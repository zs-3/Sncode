package com.badlogic.gdx.scenes.scene2d.utils;

/* loaded from: classes.dex */
public final class UIUtils {
    public static boolean isAndroid;
    public static boolean isIos;
    public static boolean isLinux;
    public static boolean isMac;
    public static boolean isWindows;

    static {
            boolean r0 = com.badlogic.gdx.utils.SharedLibraryLoader.isAndroid
            com.badlogic.gdx.scenes.scene2d.utils.UIUtils.isAndroid = r0
            boolean r0 = com.badlogic.gdx.utils.SharedLibraryLoader.isMac
            com.badlogic.gdx.scenes.scene2d.utils.UIUtils.isMac = r0
            boolean r0 = com.badlogic.gdx.utils.SharedLibraryLoader.isWindows
            com.badlogic.gdx.scenes.scene2d.utils.UIUtils.isWindows = r0
            boolean r0 = com.badlogic.gdx.utils.SharedLibraryLoader.isLinux
            com.badlogic.gdx.scenes.scene2d.utils.UIUtils.isLinux = r0
            boolean r0 = com.badlogic.gdx.utils.SharedLibraryLoader.isIos
            com.badlogic.gdx.scenes.scene2d.utils.UIUtils.isIos = r0
            return
    }

    public static boolean ctrl() {
            boolean r0 = com.badlogic.gdx.scenes.scene2d.utils.UIUtils.isMac
            if (r0 == 0) goto Ld
            com.badlogic.gdx.Input r0 = com.badlogic.gdx.Gdx.input
            r1 = 63
            boolean r0 = r0.isKeyPressed(r1)
            return r0
        Ld:
            com.badlogic.gdx.Input r0 = com.badlogic.gdx.Gdx.input
            r1 = 129(0x81, float:1.81E-43)
            boolean r0 = r0.isKeyPressed(r1)
            if (r0 != 0) goto L24
            com.badlogic.gdx.Input r0 = com.badlogic.gdx.Gdx.input
            r1 = 130(0x82, float:1.82E-43)
            boolean r0 = r0.isKeyPressed(r1)
            if (r0 == 0) goto L22
            goto L24
        L22:
            r0 = 0
            goto L25
        L24:
            r0 = 1
        L25:
            return r0
    }

    public static boolean shift() {
            com.badlogic.gdx.Input r0 = com.badlogic.gdx.Gdx.input
            r1 = 59
            boolean r0 = r0.isKeyPressed(r1)
            if (r0 != 0) goto L17
            com.badlogic.gdx.Input r0 = com.badlogic.gdx.Gdx.input
            r1 = 60
            boolean r0 = r0.isKeyPressed(r1)
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            goto L18
        L17:
            r0 = 1
        L18:
            return r0
    }
}
