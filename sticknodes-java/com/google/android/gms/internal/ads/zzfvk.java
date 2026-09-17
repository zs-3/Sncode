package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfvk extends com.google.android.gms.internal.ads.zzfwn {
    private final android.os.IBinder zza;
    private final java.lang.String zzb;
    private final int zzc;
    private final float zzd;
    private final int zze;
    private final java.lang.String zzf;

    /* synthetic */ zzfvk(android.os.IBinder r1, java.lang.String r2, int r3, float r4, int r5, int r6, java.lang.String r7, int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, com.google.android.gms.internal.ads.zzfvj r12) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r8
            r0.zzf = r10
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.internal.ads.zzfwn
            r2 = 0
            if (r1 == 0) goto L72
            com.google.android.gms.internal.ads.zzfwn r5 = (com.google.android.gms.internal.ads.zzfwn) r5
            android.os.IBinder r1 = r4.zza
            android.os.IBinder r3 = r5.zzf()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L72
            java.lang.String r1 = r4.zzb
            if (r1 != 0) goto L22
            java.lang.String r1 = r5.zzh()
            if (r1 != 0) goto L72
            goto L2c
        L22:
            java.lang.String r3 = r5.zzh()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L72
        L2c:
            int r1 = r4.zzc
            int r3 = r5.zzc()
            if (r1 != r3) goto L72
            float r1 = r4.zzd
            int r1 = java.lang.Float.floatToIntBits(r1)
            float r3 = r5.zza()
            int r3 = java.lang.Float.floatToIntBits(r3)
            if (r1 != r3) goto L72
            r5.zzb()
            r5.zzd()
            r5.zzj()
            int r1 = r4.zze
            int r3 = r5.zze()
            if (r1 != r3) goto L72
            r5.zzi()
            java.lang.String r1 = r4.zzf
            if (r1 != 0) goto L63
            java.lang.String r1 = r5.zzg()
            if (r1 != 0) goto L72
            goto L6e
        L63:
            java.lang.String r3 = r5.zzg()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L6e
            goto L72
        L6e:
            r5.zzk()
            return r0
        L72:
            return r2
    }

    public final int hashCode() {
            r5 = this;
            android.os.IBinder r0 = r5.zza
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            java.lang.String r2 = r5.zzb
            r3 = 0
            if (r2 != 0) goto L11
            r2 = 0
            goto L15
        L11:
            int r2 = r2.hashCode()
        L15:
            int r0 = r0 * r1
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r5.zzc
            r0 = r0 ^ r2
            int r0 = r0 * r1
            float r2 = r5.zzd
            int r2 = java.lang.Float.floatToIntBits(r2)
            r0 = r0 ^ r2
            int r2 = r5.zze
            java.lang.String r4 = r5.zzf
            if (r4 != 0) goto L2d
            goto L31
        L2d:
            int r3 = r4.hashCode()
        L31:
            r4 = 1525764945(0x5af15351, float:3.39635384E16)
            int r0 = r0 * r4
            r0 = r0 ^ r2
            r2 = -721379959(0xffffffffd5009d89, float:-8.838381E12)
            int r0 = r0 * r2
            r0 = r0 ^ r3
            int r0 = r0 * r1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            android.os.IBinder r0 = r3.zza
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "OverlayDisplayShowRequest{windowToken="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ", appId="
            r1.append(r0)
            java.lang.String r0 = r3.zzb
            r1.append(r0)
            java.lang.String r0 = ", layoutGravity="
            r1.append(r0)
            int r0 = r3.zzc
            r1.append(r0)
            java.lang.String r0 = ", layoutVerticalMargin="
            r1.append(r0)
            float r0 = r3.zzd
            r1.append(r0)
            java.lang.String r0 = ", displayMode=0, triggerMode=0, sessionToken=null, windowWidthPx="
            r1.append(r0)
            int r0 = r3.zze
            r1.append(r0)
            java.lang.String r0 = ", deeplinkUrl=null, adFieldEnifd="
            r1.append(r0)
            java.lang.String r0 = r3.zzf
            r1.append(r0)
            java.lang.String r0 = ", thirdPartyAuthCallerId=null}"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final float zza() {
            r1 = this;
            float r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final int zzb() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final int zzc() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final int zzd() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final int zze() {
            r1 = this;
            int r0 = r1.zze
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final android.os.IBinder zzf() {
            r1 = this;
            android.os.IBinder r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final java.lang.String zzg() {
            r1 = this;
            java.lang.String r0 = r1.zzf
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final java.lang.String zzh() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final java.lang.String zzi() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final java.lang.String zzj() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final java.lang.String zzk() {
            r1 = this;
            r0 = 0
            return r0
    }
}
