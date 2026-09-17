package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgp implements com.google.android.gms.internal.ads.zzgf {
    private final com.google.android.gms.internal.ads.zzhb zza;
    private com.google.android.gms.internal.ads.zzhh zzb;
    private java.lang.String zzc;
    private int zzd;
    private int zze;
    private boolean zzf;

    public zzgp() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzhb r0 = new com.google.android.gms.internal.ads.zzhb
            r0.<init>()
            r1.zza = r0
            r0 = 8000(0x1f40, float:1.121E-41)
            r1.zzd = r0
            r1.zze = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgf
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzgg zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgu r0 = r1.zzg()
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgp zzb(boolean r1) {
            r0 = this;
            r1 = 1
            r0.zzf = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgp zzc(int r1) {
            r0 = this;
            r0.zzd = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgp zzd(int r1) {
            r0 = this;
            r0.zze = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgp zze(com.google.android.gms.internal.ads.zzhh r1) {
            r0 = this;
            r0.zzb = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgp zzf(java.lang.String r1) {
            r0 = this;
            r0.zzc = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgu zzg() {
            r11 = this;
            com.google.android.gms.internal.ads.zzhb r6 = r11.zza
            com.google.android.gms.internal.ads.zzgu r10 = new com.google.android.gms.internal.ads.zzgu
            java.lang.String r1 = r11.zzc
            int r2 = r11.zzd
            int r3 = r11.zze
            boolean r4 = r11.zzf
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            com.google.android.gms.internal.ads.zzhh r0 = r11.zzb
            if (r0 == 0) goto L1b
            r10.zzf(r0)
        L1b:
            return r10
    }
}
