package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzki {
    public com.google.android.gms.internal.ads.zzlk zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    private boolean zze;

    public zzki(com.google.android.gms.internal.ads.zzlk r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    static /* bridge */ /* synthetic */ boolean zzd(com.google.android.gms.internal.ads.zzki r0) {
            boolean r0 = r0.zze
            return r0
    }

    public final void zza(int r3) {
            r2 = this;
            boolean r0 = r2.zze
            r0 = r0 | r3
            r1 = 1
            if (r1 == r0) goto L7
            r1 = 0
        L7:
            r2.zze = r1
            int r0 = r2.zzb
            int r0 = r0 + r3
            r2.zzb = r0
            return
    }

    public final void zzb(com.google.android.gms.internal.ads.zzlk r3) {
            r2 = this;
            boolean r0 = r2.zze
            com.google.android.gms.internal.ads.zzlk r1 = r2.zza
            if (r1 == r3) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            r0 = r0 | r1
            r2.zze = r0
            r2.zza = r3
            return
    }

    public final void zzc(int r4) {
            r3 = this;
            boolean r0 = r3.zzc
            r1 = 1
            if (r0 == 0) goto L12
            int r0 = r3.zzd
            r2 = 5
            if (r0 == r2) goto L12
            if (r4 != r2) goto Ld
            goto Le
        Ld:
            r1 = 0
        Le:
            com.google.android.gms.internal.ads.zzdi.zzd(r1)
            return
        L12:
            r3.zze = r1
            r3.zzc = r1
            r3.zzd = r4
            return
    }
}
