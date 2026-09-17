package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcby {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzccj zzb;
    private final android.view.ViewGroup zzc;
    private com.google.android.gms.internal.ads.zzcbx zzd;

    public zzcby(android.content.Context r2, android.view.ViewGroup r3, com.google.android.gms.internal.ads.zzcfo r4) {
            r1 = this;
            r1.<init>()
            android.content.Context r0 = r2.getApplicationContext()
            if (r0 == 0) goto Ld
            android.content.Context r2 = r2.getApplicationContext()
        Ld:
            r1.zza = r2
            r1.zzc = r3
            r1.zzb = r4
            r2 = 0
            r1.zzd = r2
            return
    }

    public final com.google.android.gms.internal.ads.zzcbx zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcbx r0 = r1.zzd
            return r0
    }

    public final java.lang.Integer zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcbx r0 = r1.zzd
            if (r0 == 0) goto L9
            java.lang.Integer r0 = r0.zzl()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final void zzc(int r2, int r3, int r4, int r5) {
            r1 = this;
            java.lang.String r0 = "The underlay may only be modified from the UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            com.google.android.gms.internal.ads.zzcbx r0 = r1.zzd
            if (r0 == 0) goto Lc
            r0.zzF(r2, r3, r4, r5)
        Lc:
            return
    }

    public final void zzd(int r12, int r13, int r14, int r15, int r16, boolean r17, com.google.android.gms.internal.ads.zzcci r18) {
            r11 = this;
            r0 = r11
            com.google.android.gms.internal.ads.zzcbx r1 = r0.zzd
            if (r1 == 0) goto L6
            return
        L6:
            com.google.android.gms.internal.ads.zzccj r1 = r0.zzb
            com.google.android.gms.internal.ads.zzbdi r1 = r1.zzm()
            com.google.android.gms.internal.ads.zzbdk r1 = r1.zza()
            com.google.android.gms.internal.ads.zzccj r2 = r0.zzb
            com.google.android.gms.internal.ads.zzbdh r2 = r2.zzk()
            java.lang.String r3 = "vpr2"
            java.lang.String[] r3 = new java.lang.String[]{r3}
            com.google.android.gms.internal.ads.zzbdc.zza(r1, r2, r3)
            android.content.Context r5 = r0.zza
            com.google.android.gms.internal.ads.zzccj r6 = r0.zzb
            com.google.android.gms.internal.ads.zzcbx r1 = new com.google.android.gms.internal.ads.zzcbx
            com.google.android.gms.internal.ads.zzbdi r2 = r6.zzm()
            com.google.android.gms.internal.ads.zzbdk r9 = r2.zza()
            r4 = r1
            r7 = r16
            r8 = r17
            r10 = r18
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.zzd = r1
            android.view.ViewGroup r2 = r0.zzc
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r4 = -1
            r3.<init>(r4, r4)
            r4 = 0
            r2.addView(r1, r4, r3)
            com.google.android.gms.internal.ads.zzcbx r1 = r0.zzd
            r2 = r12
            r3 = r13
            r5 = r14
            r6 = r15
            r1.zzF(r12, r13, r14, r15)
            com.google.android.gms.internal.ads.zzccj r1 = r0.zzb
            r1.zzz(r4)
            return
    }

    public final void zze() {
            r2 = this;
            java.lang.String r0 = "onDestroy must be called from the UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            com.google.android.gms.internal.ads.zzcbx r0 = r2.zzd
            if (r0 == 0) goto L16
            r0.zzo()
            android.view.ViewGroup r0 = r2.zzc
            com.google.android.gms.internal.ads.zzcbx r1 = r2.zzd
            r0.removeView(r1)
            r0 = 0
            r2.zzd = r0
        L16:
            return
    }

    public final void zzf() {
            r1 = this;
            java.lang.String r0 = "onPause must be called from the UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            com.google.android.gms.internal.ads.zzcbx r0 = r1.zzd
            if (r0 == 0) goto Lc
            r0.zzu()
        Lc:
            return
    }

    public final void zzg(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcbx r0 = r1.zzd
            if (r0 == 0) goto L7
            r0.zzC(r2)
        L7:
            return
    }
}
