package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzfz implements com.google.android.gms.internal.ads.zzgg {
    private final boolean zza;
    private final java.util.ArrayList zzb;
    private int zzc;
    private com.google.android.gms.internal.ads.zzgm zzd;

    protected zzfz(boolean r2) {
            r1 = this;
            r1.<init>()
            r1.zza = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 1
            r2.<init>(r0)
            r1.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public /* synthetic */ java.util.Map zze() {
            r1 = this;
            java.util.Map r0 = java.util.Collections.emptyMap()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void zzf(com.google.android.gms.internal.ads.zzhh r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            java.util.ArrayList r0 = r1.zzb
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L16
            java.util.ArrayList r0 = r1.zzb
            r0.add(r2)
            int r2 = r1.zzc
            int r2 = r2 + 1
            r1.zzc = r2
        L16:
            return
    }

    protected final void zzg(int r5) {
            r4 = this;
            com.google.android.gms.internal.ads.zzgm r0 = r4.zzd
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            r1 = 0
        L5:
            int r2 = r4.zzc
            if (r1 >= r2) goto L19
            java.util.ArrayList r2 = r4.zzb
            java.lang.Object r2 = r2.get(r1)
            com.google.android.gms.internal.ads.zzhh r2 = (com.google.android.gms.internal.ads.zzhh) r2
            boolean r3 = r4.zza
            r2.zza(r4, r0, r3, r5)
            int r1 = r1 + 1
            goto L5
        L19:
            return
    }

    protected final void zzh() {
            r4 = this;
            com.google.android.gms.internal.ads.zzgm r0 = r4.zzd
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            r1 = 0
        L5:
            int r2 = r4.zzc
            if (r1 >= r2) goto L19
            java.util.ArrayList r2 = r4.zzb
            java.lang.Object r2 = r2.get(r1)
            com.google.android.gms.internal.ads.zzhh r2 = (com.google.android.gms.internal.ads.zzhh) r2
            boolean r3 = r4.zza
            r2.zzb(r4, r0, r3)
            int r1 = r1 + 1
            goto L5
        L19:
            r0 = 0
            r4.zzd = r0
            return
    }

    protected final void zzi(com.google.android.gms.internal.ads.zzgm r4) {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.zzc
            if (r0 >= r1) goto L15
            java.util.ArrayList r1 = r3.zzb
            java.lang.Object r1 = r1.get(r0)
            com.google.android.gms.internal.ads.zzhh r1 = (com.google.android.gms.internal.ads.zzhh) r1
            boolean r2 = r3.zza
            r1.zzc(r3, r4, r2)
            int r0 = r0 + 1
            goto L1
        L15:
            return
    }

    protected final void zzj(com.google.android.gms.internal.ads.zzgm r4) {
            r3 = this;
            r3.zzd = r4
            r0 = 0
        L3:
            int r1 = r3.zzc
            if (r0 >= r1) goto L17
            java.util.ArrayList r1 = r3.zzb
            java.lang.Object r1 = r1.get(r0)
            com.google.android.gms.internal.ads.zzhh r1 = (com.google.android.gms.internal.ads.zzhh) r1
            boolean r2 = r3.zza
            r1.zzd(r3, r4, r2)
            int r0 = r0 + 1
            goto L3
        L17:
            return
    }
}
