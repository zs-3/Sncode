package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzchi {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzchi(int r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.zzc = r1
            r0.zzb = r2
            r0.zza = r3
            return
    }

    public static com.google.android.gms.internal.ads.zzchi zza() {
            com.google.android.gms.internal.ads.zzchi r0 = new com.google.android.gms.internal.ads.zzchi
            r1 = 0
            r0.<init>(r1, r1, r1)
            return r0
    }

    public static com.google.android.gms.internal.ads.zzchi zzb(int r2, int r3) {
            com.google.android.gms.internal.ads.zzchi r0 = new com.google.android.gms.internal.ads.zzchi
            r1 = 1
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static com.google.android.gms.internal.ads.zzchi zzc(com.google.android.gms.ads.internal.client.zzs r3) {
            boolean r0 = r3.zzd
            r1 = 0
            if (r0 == 0) goto Lc
            com.google.android.gms.internal.ads.zzchi r3 = new com.google.android.gms.internal.ads.zzchi
            r0 = 3
            r3.<init>(r0, r1, r1)
            return r3
        Lc:
            boolean r0 = r3.zzi
            if (r0 == 0) goto L17
            com.google.android.gms.internal.ads.zzchi r3 = new com.google.android.gms.internal.ads.zzchi
            r0 = 2
            r3.<init>(r0, r1, r1)
            return r3
        L17:
            boolean r0 = r3.zzh
            if (r0 == 0) goto L21
            com.google.android.gms.internal.ads.zzchi r3 = new com.google.android.gms.internal.ads.zzchi
            r3.<init>(r1, r1, r1)
            return r3
        L21:
            int r0 = r3.zzf
            int r3 = r3.zzc
            com.google.android.gms.internal.ads.zzchi r1 = new com.google.android.gms.internal.ads.zzchi
            r2 = 1
            r1.<init>(r2, r0, r3)
            return r1
    }

    public static com.google.android.gms.internal.ads.zzchi zzd() {
            com.google.android.gms.internal.ads.zzchi r0 = new com.google.android.gms.internal.ads.zzchi
            r1 = 5
            r2 = 0
            r0.<init>(r1, r2, r2)
            return r0
    }

    public static com.google.android.gms.internal.ads.zzchi zze() {
            com.google.android.gms.internal.ads.zzchi r0 = new com.google.android.gms.internal.ads.zzchi
            r1 = 4
            r2 = 0
            r0.<init>(r1, r2, r2)
            return r0
    }

    public final boolean zzf() {
            r1 = this;
            int r0 = r1.zzc
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final boolean zzg() {
            r2 = this;
            int r0 = r2.zzc
            r1 = 2
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final boolean zzh() {
            r2 = this;
            int r0 = r2.zzc
            r1 = 5
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final boolean zzi() {
            r2 = this;
            int r0 = r2.zzc
            r1 = 3
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final boolean zzj() {
            r2 = this;
            int r0 = r2.zzc
            r1 = 4
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }
}
