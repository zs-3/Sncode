package com.google.firebase.platforminfo;

/* loaded from: classes2.dex */
public final class KotlinDetector {
    public static java.lang.String detectVersion() {
            kotlin.KotlinVersion r0 = kotlin.KotlinVersion.CURRENT     // Catch: java.lang.NoClassDefFoundError -> L7
            java.lang.String r0 = r0.toString()     // Catch: java.lang.NoClassDefFoundError -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }
}
