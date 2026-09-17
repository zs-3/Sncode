package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzjw {
    private static final java.lang.Class<?> zzok = null;

    static {
            java.lang.Class r0 = zzce()
            com.google.android.gms.internal.drive.zzjw.zzok = r0
            return
    }

    private static java.lang.Class<?> zzce() {
            java.lang.String r0 = "com.google.protobuf.ExtensionRegistry"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public static com.google.android.gms.internal.drive.zzjx zzcf() {
            java.lang.Class<?> r0 = com.google.android.gms.internal.drive.zzjw.zzok
            if (r0 == 0) goto Lb
            java.lang.String r0 = "getEmptyRegistry"
            com.google.android.gms.internal.drive.zzjx r0 = zzn(r0)     // Catch: java.lang.Exception -> Lb
            return r0
        Lb:
            com.google.android.gms.internal.drive.zzjx r0 = com.google.android.gms.internal.drive.zzjx.zzoo
            return r0
    }

    static com.google.android.gms.internal.drive.zzjx zzcg() {
            java.lang.Class<?> r0 = com.google.android.gms.internal.drive.zzjw.zzok
            if (r0 == 0) goto Lb
            java.lang.String r0 = "loadGeneratedRegistry"
            com.google.android.gms.internal.drive.zzjx r0 = zzn(r0)     // Catch: java.lang.Exception -> Lb
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto L12
            com.google.android.gms.internal.drive.zzjx r0 = com.google.android.gms.internal.drive.zzjx.zzcg()
        L12:
            if (r0 != 0) goto L18
            com.google.android.gms.internal.drive.zzjx r0 = zzcf()
        L18:
            return r0
    }

    private static final com.google.android.gms.internal.drive.zzjx zzn(java.lang.String r3) throws java.lang.Exception {
            java.lang.Class<?> r0 = com.google.android.gms.internal.drive.zzjw.zzok
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]
            java.lang.reflect.Method r3 = r0.getDeclaredMethod(r3, r2)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r1 = 0
            java.lang.Object r3 = r3.invoke(r1, r0)
            com.google.android.gms.internal.drive.zzjx r3 = (com.google.android.gms.internal.drive.zzjx) r3
            return r3
    }
}
