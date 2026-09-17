package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
public class Logger {
    private int level;
    private final java.lang.String tag;

    public Logger(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.tag = r1
            r0.level = r2
            return
    }

    public void debug(java.lang.String r3) {
            r2 = this;
            int r0 = r2.level
            r1 = 3
            if (r0 < r1) goto Lc
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            java.lang.String r1 = r2.tag
            r0.debug(r1, r3)
        Lc:
            return
    }

    public void error(java.lang.String r3) {
            r2 = this;
            int r0 = r2.level
            r1 = 1
            if (r0 < r1) goto Lc
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            java.lang.String r1 = r2.tag
            r0.error(r1, r3)
        Lc:
            return
    }

    public void error(java.lang.String r3, java.lang.Throwable r4) {
            r2 = this;
            int r0 = r2.level
            r1 = 1
            if (r0 < r1) goto Lc
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            java.lang.String r1 = r2.tag
            r0.error(r1, r3, r4)
        Lc:
            return
    }

    public int getLevel() {
            r1 = this;
            int r0 = r1.level
            return r0
    }

    public void info(java.lang.String r3) {
            r2 = this;
            int r0 = r2.level
            r1 = 2
            if (r0 < r1) goto Lc
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            java.lang.String r1 = r2.tag
            r0.log(r1, r3)
        Lc:
            return
    }
}
