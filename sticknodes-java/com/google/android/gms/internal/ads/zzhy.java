package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzhy {
    private final android.media.AudioManager zza;
    private final com.google.android.gms.internal.ads.zzhw zzb;
    private com.google.android.gms.internal.ads.zzhx zzc;
    private int zzd;
    private float zze;

    public zzhy(android.content.Context r2, android.os.Handler r3, com.google.android.gms.internal.ads.zzhx r4) {
            r1 = this;
            r1.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.zze = r0
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r0 = "audio"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.media.AudioManager r2 = (android.media.AudioManager) r2
            java.util.Objects.requireNonNull(r2)
            r1.zza = r2
            r1.zzc = r4
            com.google.android.gms.internal.ads.zzhw r2 = new com.google.android.gms.internal.ads.zzhw
            r2.<init>(r1, r3)
            r1.zzb = r2
            r2 = 0
            r1.zzd = r2
            return
    }

    static /* bridge */ /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzhy r2, int r3) {
            r0 = -3
            r1 = -2
            if (r3 == r0) goto L35
            if (r3 == r1) goto L35
            r0 = -1
            r1 = 1
            if (r3 == r0) goto L2b
            if (r3 == r1) goto L23
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Unknown focus change type: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "AudioFocusManager"
            com.google.android.gms.internal.ads.zzea.zzf(r3, r2)
            return
        L23:
            r3 = 2
            r2.zzg(r3)
            r2.zzf(r1)
            return
        L2b:
            r2.zzf(r0)
            r2.zze()
            r2.zzg(r1)
            return
        L35:
            if (r3 == r1) goto L3c
            r3 = 4
            r2.zzg(r3)
            return
        L3c:
            r3 = 0
            r2.zzf(r3)
            r3 = 3
            r2.zzg(r3)
            return
    }

    private final void zze() {
            r2 = this;
            int r0 = r2.zzd
            r1 = 1
            if (r0 == r1) goto L15
            if (r0 != 0) goto L8
            goto L15
        L8:
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            r1 = 26
            if (r0 >= r1) goto L15
            android.media.AudioManager r0 = r2.zza
            com.google.android.gms.internal.ads.zzhw r1 = r2.zzb
            r0.abandonAudioFocus(r1)
        L15:
            return
    }

    private final void zzf(int r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzhx r0 = r3.zzc
            if (r0 == 0) goto L13
            int r1 = com.google.android.gms.internal.ads.zzjz.zzC(r4)
            com.google.android.gms.internal.ads.zzjv r0 = (com.google.android.gms.internal.ads.zzjv) r0
            com.google.android.gms.internal.ads.zzjz r0 = r0.zza
            boolean r2 = r0.zzu()
            com.google.android.gms.internal.ads.zzjz.zzM(r0, r2, r4, r1)
        L13:
            return
    }

    private final void zzg(int r2) {
            r1 = this;
            int r0 = r1.zzd
            if (r0 != r2) goto L5
            goto L23
        L5:
            r1.zzd = r2
            r0 = 4
            if (r2 != r0) goto Le
            r2 = 1045220557(0x3e4ccccd, float:0.2)
            goto L10
        Le:
            r2 = 1065353216(0x3f800000, float:1.0)
        L10:
            float r0 = r1.zze
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L23
            r1.zze = r2
            com.google.android.gms.internal.ads.zzhx r2 = r1.zzc
            if (r2 == 0) goto L23
            com.google.android.gms.internal.ads.zzjv r2 = (com.google.android.gms.internal.ads.zzjv) r2
            com.google.android.gms.internal.ads.zzjz r2 = r2.zza
            com.google.android.gms.internal.ads.zzjz.zzJ(r2)
        L23:
            return
    }

    public final float zza() {
            r1 = this;
            float r0 = r1.zze
            return r0
    }

    public final int zzb(boolean r1, int r2) {
            r0 = this;
            r0.zze()
            r1 = 0
            r0.zzg(r1)
            r1 = 1
            return r1
    }

    public final void zzd() {
            r1 = this;
            r0 = 0
            r1.zzc = r0
            r1.zze()
            r0 = 0
            r1.zzg(r0)
            return
    }
}
