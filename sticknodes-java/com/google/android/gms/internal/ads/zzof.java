package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzof {
    final /* synthetic */ com.google.android.gms.internal.ads.zzog zza;
    private final java.lang.String zzb;
    private int zzc;
    private long zzd;
    private com.google.android.gms.internal.ads.zzuy zze;
    private boolean zzf;
    private boolean zzg;

    public zzof(com.google.android.gms.internal.ads.zzog r1, java.lang.String r2, int r3, com.google.android.gms.internal.ads.zzuy r4) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r0.zzb = r2
            r0.zzc = r3
            if (r4 != 0) goto Le
            r1 = -1
            goto L10
        Le:
            long r1 = r4.zzd
        L10:
            r0.zzd = r1
            if (r4 == 0) goto L1c
            boolean r1 = r4.zzb()
            if (r1 == 0) goto L1c
            r0.zze = r4
        L1c:
            return
    }

    static /* bridge */ /* synthetic */ int zza(com.google.android.gms.internal.ads.zzof r0) {
            int r0 = r0.zzc
            return r0
    }

    static /* bridge */ /* synthetic */ long zzb(com.google.android.gms.internal.ads.zzof r2) {
            long r0 = r2.zzd
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzuy zzc(com.google.android.gms.internal.ads.zzof r0) {
            com.google.android.gms.internal.ads.zzuy r0 = r0.zze
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String zzd(com.google.android.gms.internal.ads.zzof r0) {
            java.lang.String r0 = r0.zzb
            return r0
    }

    static /* bridge */ /* synthetic */ void zze(com.google.android.gms.internal.ads.zzof r0, boolean r1) {
            r1 = 1
            r0.zzg = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzof r0, boolean r1) {
            r1 = 1
            r0.zzf = r1
            return
    }

    static /* bridge */ /* synthetic */ boolean zzh(com.google.android.gms.internal.ads.zzof r0) {
            boolean r0 = r0.zzg
            return r0
    }

    static /* bridge */ /* synthetic */ boolean zzi(com.google.android.gms.internal.ads.zzof r0) {
            boolean r0 = r0.zzf
            return r0
    }

    public final void zzg(int r6, com.google.android.gms.internal.ads.zzuy r7) {
            r5 = this;
            long r0 = r5.zzd
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L1c
            int r0 = r5.zzc
            if (r6 != r0) goto L1c
            if (r7 == 0) goto L1c
            com.google.android.gms.internal.ads.zzog r6 = r5.zza
            long r0 = r7.zzd
            long r6 = com.google.android.gms.internal.ads.zzog.zza(r6)
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 < 0) goto L1c
            r5.zzd = r0
        L1c:
            return
    }

    public final boolean zzj(int r8, com.google.android.gms.internal.ads.zzuy r9) {
            r7 = this;
            r0 = 1
            r1 = 0
            if (r9 != 0) goto La
            int r9 = r7.zzc
            if (r8 != r9) goto L9
            return r0
        L9:
            return r1
        La:
            com.google.android.gms.internal.ads.zzuy r8 = r7.zze
            if (r8 != 0) goto L1e
            boolean r8 = r9.zzb()
            if (r8 != 0) goto L1d
            long r8 = r9.zzd
            long r2 = r7.zzd
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 != 0) goto L1d
            return r0
        L1d:
            return r1
        L1e:
            long r2 = r9.zzd
            long r4 = r8.zzd
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L33
            int r2 = r9.zzb
            int r3 = r8.zzb
            if (r2 != r3) goto L33
            int r9 = r9.zzc
            int r8 = r8.zzc
            if (r9 != r8) goto L33
            return r0
        L33:
            return r1
    }

    public final boolean zzk(com.google.android.gms.internal.ads.zzmb r11) {
            r10 = this;
            com.google.android.gms.internal.ads.zzuy r0 = r11.zzd
            r1 = 1
            r2 = 0
            if (r0 != 0) goto Le
            int r0 = r10.zzc
            int r11 = r11.zzc
            if (r0 == r11) goto Ld
            return r1
        Ld:
            return r2
        Le:
            long r3 = r10.zzd
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L17
            return r2
        L17:
            long r5 = r0.zzd
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L1e
            return r1
        L1e:
            com.google.android.gms.internal.ads.zzuy r3 = r10.zze
            if (r3 != 0) goto L23
            return r2
        L23:
            com.google.android.gms.internal.ads.zzcc r3 = r11.zzb
            java.lang.Object r0 = r0.zza
            int r0 = r3.zza(r0)
            com.google.android.gms.internal.ads.zzuy r4 = r10.zze
            java.lang.Object r4 = r4.zza
            int r3 = r3.zza(r4)
            com.google.android.gms.internal.ads.zzuy r4 = r11.zzd
            long r5 = r4.zzd
            com.google.android.gms.internal.ads.zzuy r7 = r10.zze
            long r7 = r7.zzd
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 < 0) goto L71
            if (r0 >= r3) goto L42
            goto L71
        L42:
            if (r0 <= r3) goto L45
            return r1
        L45:
            boolean r0 = r4.zzb()
            if (r0 == 0) goto L61
            com.google.android.gms.internal.ads.zzuy r11 = r11.zzd
            int r0 = r11.zzb
            int r11 = r11.zzc
            com.google.android.gms.internal.ads.zzuy r3 = r10.zze
            int r4 = r3.zzb
            if (r0 > r4) goto L60
            if (r0 != r4) goto L5f
            int r0 = r3.zzc
            if (r11 <= r0) goto L5e
            goto L60
        L5e:
            return r2
        L5f:
            r1 = 0
        L60:
            return r1
        L61:
            com.google.android.gms.internal.ads.zzuy r11 = r11.zzd
            int r11 = r11.zze
            r0 = -1
            if (r11 == r0) goto L70
            com.google.android.gms.internal.ads.zzuy r0 = r10.zze
            int r0 = r0.zzb
            if (r11 <= r0) goto L6f
            goto L70
        L6f:
            return r2
        L70:
            return r1
        L71:
            return r2
    }

    public final boolean zzl(com.google.android.gms.internal.ads.zzcc r7, com.google.android.gms.internal.ads.zzcc r8) {
            r6 = this;
            int r0 = r6.zzc
            int r1 = r7.zzc()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L13
            int r7 = r8.zzc()
            if (r0 >= r7) goto L11
            goto L4a
        L11:
            r0 = -1
            goto L4a
        L13:
            com.google.android.gms.internal.ads.zzog r1 = r6.zza
            com.google.android.gms.internal.ads.zzcb r1 = com.google.android.gms.internal.ads.zzog.zzc(r1)
            r4 = 0
            r7.zze(r0, r1, r4)
            com.google.android.gms.internal.ads.zzog r0 = r6.zza
            com.google.android.gms.internal.ads.zzcb r0 = com.google.android.gms.internal.ads.zzog.zzc(r0)
            int r0 = r0.zzn
        L26:
            com.google.android.gms.internal.ads.zzog r1 = r6.zza
            com.google.android.gms.internal.ads.zzcb r1 = com.google.android.gms.internal.ads.zzog.zzc(r1)
            int r1 = r1.zzo
            if (r0 > r1) goto L11
            java.lang.Object r1 = r7.zzf(r0)
            int r1 = r8.zza(r1)
            if (r1 == r3) goto L47
            com.google.android.gms.internal.ads.zzog r7 = r6.zza
            com.google.android.gms.internal.ads.zzca r7 = com.google.android.gms.internal.ads.zzog.zzb(r7)
            com.google.android.gms.internal.ads.zzca r7 = r8.zzd(r1, r7, r2)
            int r0 = r7.zzc
            goto L4a
        L47:
            int r0 = r0 + 1
            goto L26
        L4a:
            r6.zzc = r0
            if (r0 != r3) goto L4f
            return r2
        L4f:
            com.google.android.gms.internal.ads.zzuy r7 = r6.zze
            r0 = 1
            if (r7 != 0) goto L55
            return r0
        L55:
            java.lang.Object r7 = r7.zza
            int r7 = r8.zza(r7)
            if (r7 == r3) goto L5e
            return r0
        L5e:
            return r2
    }
}
