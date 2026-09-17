package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public final class zzcz {
    final android.net.Uri zza;
    final java.lang.String zzb;
    final java.lang.String zzc;
    final boolean zzd;
    final boolean zze;

    public zzcz(android.net.Uri r11) {
            r10 = this;
            r1 = 0
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r0 = r10
            r2 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    private zzcz(java.lang.String r1, android.net.Uri r2, java.lang.String r3, java.lang.String r4, boolean r5, boolean r6, boolean r7, boolean r8, com.google.android.gms.internal.auth.zzdg r9) {
            r0 = this;
            r0.<init>()
            r0.zza = r2
            java.lang.String r1 = ""
            r0.zzb = r1
            r0.zzc = r1
            r0.zzd = r5
            r0.zze = r7
            return
    }

    public final com.google.android.gms.internal.auth.zzcz zza() {
            r11 = this;
            com.google.android.gms.internal.auth.zzcz r10 = new com.google.android.gms.internal.auth.zzcz
            android.net.Uri r2 = r11.zza
            java.lang.String r3 = r11.zzb
            java.lang.String r4 = r11.zzc
            boolean r5 = r11.zzd
            r1 = 0
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    public final com.google.android.gms.internal.auth.zzcz zzb() {
            r11 = this;
            java.lang.String r0 = r11.zzb
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1c
            com.google.android.gms.internal.auth.zzcz r0 = new com.google.android.gms.internal.auth.zzcz
            r2 = 0
            android.net.Uri r3 = r11.zza
            java.lang.String r4 = r11.zzb
            java.lang.String r5 = r11.zzc
            r6 = 1
            r7 = 0
            boolean r8 = r11.zze
            r9 = 0
            r10 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L1c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot set GServices prefix and skip GServices"
            r0.<init>(r1)
            throw r0
    }

    public final com.google.android.gms.internal.auth.zzdc zzc(java.lang.String r2, double r3) {
            r1 = this;
            r3 = 0
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            com.google.android.gms.internal.auth.zzcx r4 = new com.google.android.gms.internal.auth.zzcx
            r0 = 1
            r4.<init>(r1, r2, r3, r0)
            return r4
    }

    public final com.google.android.gms.internal.auth.zzdc zzd(java.lang.String r2, long r3) {
            r1 = this;
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            com.google.android.gms.internal.auth.zzcv r4 = new com.google.android.gms.internal.auth.zzcv
            r0 = 1
            r4.<init>(r1, r2, r3, r0)
            return r4
    }

    public final com.google.android.gms.internal.auth.zzdc zze(java.lang.String r3, boolean r4) {
            r2 = this;
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            com.google.android.gms.internal.auth.zzcw r0 = new com.google.android.gms.internal.auth.zzcw
            r1 = 1
            r0.<init>(r2, r3, r4, r1)
            return r0
    }

    public final com.google.android.gms.internal.auth.zzdc zzf(java.lang.String r7, java.lang.Object r8, com.google.android.gms.internal.auth.zzhy r9) {
            r6 = this;
            com.google.android.gms.internal.auth.zzcy r7 = new com.google.android.gms.internal.auth.zzcy
            java.lang.String r2 = "getTokenRefactor__blocked_packages"
            r4 = 1
            r0 = r7
            r1 = r6
            r3 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r7
    }
}
