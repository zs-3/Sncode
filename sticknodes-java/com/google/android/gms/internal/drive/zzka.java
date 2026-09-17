package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzka {
    private static final com.google.android.gms.internal.drive.zzjy<?> zzoq = null;
    private static final com.google.android.gms.internal.drive.zzjy<?> zzor = null;

    static {
            com.google.android.gms.internal.drive.zzjz r0 = new com.google.android.gms.internal.drive.zzjz
            r0.<init>()
            com.google.android.gms.internal.drive.zzka.zzoq = r0
            com.google.android.gms.internal.drive.zzjy r0 = zzck()
            com.google.android.gms.internal.drive.zzka.zzor = r0
            return
    }

    private static com.google.android.gms.internal.drive.zzjy<?> zzck() {
            java.lang.String r0 = "com.google.protobuf.ExtensionSchemaFull"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L16
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L16
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.Exception -> L16
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L16
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L16
            com.google.android.gms.internal.drive.zzjy r0 = (com.google.android.gms.internal.drive.zzjy) r0     // Catch: java.lang.Exception -> L16
            return r0
        L16:
            r0 = 0
            return r0
    }

    static com.google.android.gms.internal.drive.zzjy<?> zzcl() {
            com.google.android.gms.internal.drive.zzjy<?> r0 = com.google.android.gms.internal.drive.zzka.zzoq
            return r0
    }

    static com.google.android.gms.internal.drive.zzjy<?> zzcm() {
            com.google.android.gms.internal.drive.zzjy<?> r0 = com.google.android.gms.internal.drive.zzka.zzor
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Protobuf runtime is not correctly loaded."
            r0.<init>(r1)
            throw r0
    }
}
