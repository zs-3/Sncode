package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzkj implements com.google.android.gms.internal.drive.zzlp {
    private static final com.google.android.gms.internal.drive.zzkj zzrp = null;

    static {
            com.google.android.gms.internal.drive.zzkj r0 = new com.google.android.gms.internal.drive.zzkj
            r0.<init>()
            com.google.android.gms.internal.drive.zzkj.zzrp = r0
            return
    }

    private zzkj() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.internal.drive.zzkj zzcv() {
            com.google.android.gms.internal.drive.zzkj r0 = com.google.android.gms.internal.drive.zzkj.zzrp
            return r0
    }

    @Override // com.google.android.gms.internal.drive.zzlp
    public final boolean zzb(java.lang.Class<?> r2) {
            r1 = this;
            java.lang.Class<com.google.android.gms.internal.drive.zzkk> r0 = com.google.android.gms.internal.drive.zzkk.class
            boolean r2 = r0.isAssignableFrom(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.drive.zzlp
    public final com.google.android.gms.internal.drive.zzlo zzc(java.lang.Class<?> r5) {
            r4 = this;
            java.lang.Class<com.google.android.gms.internal.drive.zzkk> r0 = com.google.android.gms.internal.drive.zzkk.class
            boolean r1 = r0.isAssignableFrom(r5)
            if (r1 != 0) goto L24
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported message type: "
            java.lang.String r5 = r5.getName()
            int r2 = r5.length()
            if (r2 == 0) goto L1b
            java.lang.String r5 = r1.concat(r5)
            goto L20
        L1b:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1)
        L20:
            r0.<init>(r5)
            throw r0
        L24:
            java.lang.Class r0 = r5.asSubclass(r0)     // Catch: java.lang.Exception -> L36
            com.google.android.gms.internal.drive.zzkk r0 = com.google.android.gms.internal.drive.zzkk.zzd(r0)     // Catch: java.lang.Exception -> L36
            int r1 = com.google.android.gms.internal.drive.zzkk.zze.zzrz     // Catch: java.lang.Exception -> L36
            r2 = 0
            java.lang.Object r0 = r0.zza(r1, r2, r2)     // Catch: java.lang.Exception -> L36
            com.google.android.gms.internal.drive.zzlo r0 = (com.google.android.gms.internal.drive.zzlo) r0     // Catch: java.lang.Exception -> L36
            return r0
        L36:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unable to get message info for "
            java.lang.String r5 = r5.getName()
            int r3 = r5.length()
            if (r3 == 0) goto L4a
            java.lang.String r5 = r2.concat(r5)
            goto L4f
        L4a:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2)
        L4f:
            r1.<init>(r5, r0)
            throw r1
    }
}
