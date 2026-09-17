package com.google.android.gms.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes.dex */
class zzw {
    private static final com.google.android.gms.common.zzw zze = null;
    final boolean zza;
    final java.lang.String zzb;
    final java.lang.Throwable zzc;
    final int zzd;

    static {
            com.google.android.gms.common.zzw r6 = new com.google.android.gms.common.zzw
            r1 = 1
            r2 = 3
            r3 = 1
            r4 = 0
            r5 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            com.google.android.gms.common.zzw.zze = r6
            return
    }

    private zzw(boolean r1, int r2, int r3, java.lang.String r4, java.lang.Throwable r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzd = r2
            r0.zzb = r4
            r0.zzc = r5
            return
    }

    /* synthetic */ zzw(boolean r1, int r2, int r3, java.lang.String r4, java.lang.Throwable r5, com.google.android.gms.common.zzv r6) {
            r0 = this;
            r2 = 0
            r3 = 1
            r4 = 5
            r5 = 0
            r6 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    @java.lang.Deprecated
    static com.google.android.gms.common.zzw zzb() {
            com.google.android.gms.common.zzw r0 = com.google.android.gms.common.zzw.zze
            return r0
    }

    static com.google.android.gms.common.zzw zzc(java.lang.String r7) {
            com.google.android.gms.common.zzw r6 = new com.google.android.gms.common.zzw
            r1 = 0
            r2 = 1
            r3 = 5
            r5 = 0
            r0 = r6
            r4 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    static com.google.android.gms.common.zzw zzd(java.lang.String r7, java.lang.Throwable r8) {
            com.google.android.gms.common.zzw r6 = new com.google.android.gms.common.zzw
            r1 = 0
            r2 = 1
            r3 = 5
            r0 = r6
            r4 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    static com.google.android.gms.common.zzw zzf(int r7) {
            com.google.android.gms.common.zzw r6 = new com.google.android.gms.common.zzw
            r1 = 1
            r3 = 1
            r4 = 0
            r5 = 0
            r0 = r6
            r2 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    static com.google.android.gms.common.zzw zzg(int r7, int r8, java.lang.String r9, java.lang.Throwable r10) {
            com.google.android.gms.common.zzw r6 = new com.google.android.gms.common.zzw
            r1 = 0
            r0 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    java.lang.String zza() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    final void zze() {
            r3 = this;
            boolean r0 = r3.zza
            if (r0 != 0) goto L22
            r0 = 3
            java.lang.String r1 = "GoogleCertificatesRslt"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L22
            java.lang.Throwable r0 = r3.zzc
            if (r0 == 0) goto L1b
            java.lang.String r0 = r3.zza()
            java.lang.Throwable r2 = r3.zzc
            android.util.Log.d(r1, r0, r2)
            return
        L1b:
            java.lang.String r0 = r3.zza()
            android.util.Log.d(r1, r0)
        L22:
            return
    }
}
