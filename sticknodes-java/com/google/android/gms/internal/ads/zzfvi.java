package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfvi extends com.google.android.gms.internal.ads.zzfwm {
    private android.os.IBinder zza;
    private java.lang.String zzb;
    private int zzc;
    private float zzd;
    private int zze;
    private java.lang.String zzf;
    private byte zzg;

    zzfvi() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfwm
    public final com.google.android.gms.internal.ads.zzfwm zza(java.lang.String r1) {
            r0 = this;
            r0.zzf = r1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfwm
    public final com.google.android.gms.internal.ads.zzfwm zzb(java.lang.String r1) {
            r0 = this;
            r0.zzb = r1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfwm
    public final com.google.android.gms.internal.ads.zzfwm zzc(int r1) {
            r0 = this;
            byte r1 = r0.zzg
            r1 = r1 | 4
            byte r1 = (byte) r1
            r0.zzg = r1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfwm
    public final com.google.android.gms.internal.ads.zzfwm zzd(int r1) {
            r0 = this;
            r0.zzc = r1
            byte r1 = r0.zzg
            r1 = r1 | 1
            byte r1 = (byte) r1
            r0.zzg = r1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfwm
    public final com.google.android.gms.internal.ads.zzfwm zze(float r1) {
            r0 = this;
            r0.zzd = r1
            byte r1 = r0.zzg
            r1 = r1 | 2
            byte r1 = (byte) r1
            r0.zzg = r1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfwm
    public final com.google.android.gms.internal.ads.zzfwm zzf(int r1) {
            r0 = this;
            byte r1 = r0.zzg
            r1 = r1 | 8
            byte r1 = (byte) r1
            r0.zzg = r1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfwm
    public final com.google.android.gms.internal.ads.zzfwm zzg(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "Null windowToken"
            java.util.Objects.requireNonNull(r2, r0)
            r1.zza = r2
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzfwm
    public final com.google.android.gms.internal.ads.zzfwm zzh(int r1) {
            r0 = this;
            r0.zze = r1
            byte r1 = r0.zzg
            r1 = r1 | 16
            byte r1 = (byte) r1
            r0.zzg = r1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfwm
    public final com.google.android.gms.internal.ads.zzfwn zzi() {
            r15 = this;
            byte r0 = r15.zzg
            r1 = 31
            if (r0 != r1) goto L22
            android.os.IBinder r3 = r15.zza
            if (r3 != 0) goto Lb
            goto L22
        Lb:
            com.google.android.gms.internal.ads.zzfvk r0 = new com.google.android.gms.internal.ads.zzfvk
            java.lang.String r4 = r15.zzb
            int r5 = r15.zzc
            float r6 = r15.zzd
            r7 = 0
            r8 = 0
            r9 = 0
            int r10 = r15.zze
            r11 = 0
            java.lang.String r12 = r15.zzf
            r13 = 0
            r14 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L22:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.os.IBinder r1 = r15.zza
            if (r1 != 0) goto L30
            java.lang.String r1 = " windowToken"
            r0.append(r1)
        L30:
            byte r1 = r15.zzg
            r1 = r1 & 1
            if (r1 != 0) goto L3b
            java.lang.String r1 = " layoutGravity"
            r0.append(r1)
        L3b:
            byte r1 = r15.zzg
            r1 = r1 & 2
            if (r1 != 0) goto L46
            java.lang.String r1 = " layoutVerticalMargin"
            r0.append(r1)
        L46:
            byte r1 = r15.zzg
            r1 = r1 & 4
            if (r1 != 0) goto L51
            java.lang.String r1 = " displayMode"
            r0.append(r1)
        L51:
            byte r1 = r15.zzg
            r1 = r1 & 8
            if (r1 != 0) goto L5c
            java.lang.String r1 = " triggerMode"
            r0.append(r1)
        L5c:
            byte r1 = r15.zzg
            r1 = r1 & 16
            if (r1 != 0) goto L67
            java.lang.String r1 = " windowWidthPx"
            r0.append(r1)
        L67:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "Missing required properties:"
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
    }
}
