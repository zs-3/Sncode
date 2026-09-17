package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzgk {
    public static final /* synthetic */ int zza = 0;
    private static final java.lang.Class zzb = null;
    private static final com.google.android.gms.internal.auth.zzgz zzc = null;
    private static final com.google.android.gms.internal.auth.zzgz zzd = null;

    static {
            r0 = 0
            java.lang.String r1 = "com.google.protobuf.GeneratedMessage"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L8
            goto L9
        L8:
            r1 = r0
        L9:
            com.google.android.gms.internal.auth.zzgk.zzb = r1
            java.lang.String r1 = "com.google.protobuf.UnknownFieldSetSchema"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L12
            goto L13
        L12:
            r1 = r0
        L13:
            if (r1 != 0) goto L16
            goto L26
        L16:
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L26
            java.lang.reflect.Constructor r1 = r1.getConstructor(r3)     // Catch: java.lang.Throwable -> L26
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L26
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.auth.zzgz r1 = (com.google.android.gms.internal.auth.zzgz) r1     // Catch: java.lang.Throwable -> L26
            r0 = r1
        L26:
            com.google.android.gms.internal.auth.zzgk.zzc = r0
            com.google.android.gms.internal.auth.zzhb r0 = new com.google.android.gms.internal.auth.zzhb
            r0.<init>()
            com.google.android.gms.internal.auth.zzgk.zzd = r0
            return
    }

    public static com.google.android.gms.internal.auth.zzgz zza() {
            com.google.android.gms.internal.auth.zzgz r0 = com.google.android.gms.internal.auth.zzgk.zzc
            return r0
    }

    public static com.google.android.gms.internal.auth.zzgz zzb() {
            com.google.android.gms.internal.auth.zzgz r0 = com.google.android.gms.internal.auth.zzgk.zzd
            return r0
    }

    static java.lang.Object zzc(java.lang.Object r2, int r3, int r4, java.lang.Object r5, com.google.android.gms.internal.auth.zzgz r6) {
            if (r5 != 0) goto L6
            java.lang.Object r5 = r6.zza(r2)
        L6:
            long r0 = (long) r4
            r6.zzd(r5, r3, r0)
            return r5
    }

    static void zzd(com.google.android.gms.internal.auth.zzgz r1, java.lang.Object r2, java.lang.Object r3) {
            java.lang.Object r0 = r1.zzb(r2)
            java.lang.Object r3 = r1.zzb(r3)
            java.lang.Object r3 = r1.zzc(r0, r3)
            r1.zzf(r2, r3)
            return
    }

    public static void zze(java.lang.Class r1) {
            java.lang.Class<com.google.android.gms.internal.auth.zzev> r0 = com.google.android.gms.internal.auth.zzev.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L1b
            java.lang.Class r0 = com.google.android.gms.internal.auth.zzgk.zzb
            if (r0 == 0) goto L1b
            boolean r1 = r0.isAssignableFrom(r1)
            if (r1 == 0) goto L13
            goto L1b
        L13:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Message classes must extend GeneratedMessage or GeneratedMessageLite"
            r1.<init>(r0)
            throw r1
        L1b:
            return
    }

    static boolean zzf(java.lang.Object r2, java.lang.Object r3) {
            r0 = 0
            r1 = 1
            if (r2 == r3) goto Le
            if (r2 == 0) goto Lf
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Ld
            goto Le
        Ld:
            return r0
        Le:
            r0 = 1
        Lf:
            return r0
    }
}
