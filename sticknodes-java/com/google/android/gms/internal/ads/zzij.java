package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzij extends com.google.android.gms.internal.ads.zzbp {
    public final int zzc;
    public final java.lang.String zzd;
    public final int zze;
    public final com.google.android.gms.internal.ads.zzaf zzf;
    public final int zzg;
    public final com.google.android.gms.internal.ads.zzuy zzh;
    final boolean zzi;

    static {
            r0 = 1001(0x3e9, float:1.403E-42)
            r1 = 36
            java.lang.Integer.toString(r0, r1)
            r0 = 1002(0x3ea, float:1.404E-42)
            java.lang.Integer.toString(r0, r1)
            r0 = 1003(0x3eb, float:1.406E-42)
            java.lang.Integer.toString(r0, r1)
            r0 = 1004(0x3ec, float:1.407E-42)
            java.lang.Integer.toString(r0, r1)
            r0 = 1005(0x3ed, float:1.408E-42)
            java.lang.Integer.toString(r0, r1)
            r0 = 1006(0x3ee, float:1.41E-42)
            java.lang.Integer.toString(r0, r1)
            return
    }

    private zzij(int r11, java.lang.Throwable r12, int r13) {
            r10 = this;
            r3 = 0
            r5 = 0
            r6 = -1
            r7 = 0
            r8 = 4
            r9 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r4 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    private zzij(int r14, java.lang.Throwable r15, java.lang.String r16, int r17, java.lang.String r18, int r19, com.google.android.gms.internal.ads.zzaf r20, int r21, boolean r22) {
            r13 = this;
            r4 = r14
            r8 = r21
            if (r4 == 0) goto L5f
            r0 = 1
            if (r4 == r0) goto Lf
            java.lang.String r0 = "Unexpected runtime error"
            r5 = r18
            r6 = r19
            goto L65
        Lf:
            java.lang.String r1 = java.lang.String.valueOf(r20)
            int r2 = com.google.android.gms.internal.ads.zzeu.zza
            if (r8 == 0) goto L34
            if (r8 == r0) goto L31
            r0 = 2
            if (r8 == r0) goto L2e
            r0 = 3
            if (r8 == r0) goto L2b
            r0 = 4
            if (r8 != r0) goto L25
            java.lang.String r0 = "YES"
            goto L36
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L2b:
            java.lang.String r0 = "NO_EXCEEDS_CAPABILITIES"
            goto L36
        L2e:
            java.lang.String r0 = "NO_UNSUPPORTED_DRM"
            goto L36
        L31:
            java.lang.String r0 = "NO_UNSUPPORTED_TYPE"
            goto L36
        L34:
            java.lang.String r0 = "NO"
        L36:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = r18
            r2.append(r5)
            java.lang.String r3 = " error, index="
            r2.append(r3)
            r6 = r19
            r2.append(r6)
            java.lang.String r3 = ", format="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ", format_supported="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L65
        L5f:
            r5 = r18
            r6 = r19
            java.lang.String r0 = "Source error"
        L65:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L72
            java.lang.String r1 = ": null"
            java.lang.String r0 = r0.concat(r1)
        L72:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r17
            r4 = r14
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r12 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
    }

    private zzij(java.lang.String r10, java.lang.Throwable r11, int r12, int r13, java.lang.String r14, int r15, com.google.android.gms.internal.ads.zzaf r16, int r17, com.google.android.gms.internal.ads.zzuy r18, long r19, boolean r21) {
            r9 = this;
            r7 = r9
            r8 = r21
            android.os.Bundle r4 = android.os.Bundle.EMPTY
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r5 = r19
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 0
            r1 = 1
            if (r8 == 0) goto L19
            r2 = r13
            if (r2 != r1) goto L17
            r2 = 1
            goto L1a
        L17:
            r3 = 0
            goto L1b
        L19:
            r2 = r13
        L1a:
            r3 = 1
        L1b:
            com.google.android.gms.internal.ads.zzdi.zzd(r3)
            if (r11 != 0) goto L21
            goto L22
        L21:
            r0 = 1
        L22:
            com.google.android.gms.internal.ads.zzdi.zzd(r0)
            r7.zzc = r2
            r0 = r14
            r7.zzd = r0
            r0 = r15
            r7.zze = r0
            r0 = r16
            r7.zzf = r0
            r0 = r17
            r7.zzg = r0
            r0 = r18
            r7.zzh = r0
            r7.zzi = r8
            return
    }

    public static com.google.android.gms.internal.ads.zzij zzb(java.lang.Throwable r11, java.lang.String r12, int r13, com.google.android.gms.internal.ads.zzaf r14, int r15, boolean r16, int r17) {
            com.google.android.gms.internal.ads.zzij r10 = new com.google.android.gms.internal.ads.zzij
            if (r14 != 0) goto L7
            r0 = 4
            r8 = 4
            goto L8
        L7:
            r8 = r15
        L8:
            r1 = 1
            r3 = 0
            r0 = r10
            r2 = r11
            r4 = r17
            r5 = r12
            r6 = r13
            r7 = r14
            r9 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    public static com.google.android.gms.internal.ads.zzij zzc(java.io.IOException r2, int r3) {
            com.google.android.gms.internal.ads.zzij r0 = new com.google.android.gms.internal.ads.zzij
            r1 = 0
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static com.google.android.gms.internal.ads.zzij zzd(java.lang.RuntimeException r2, int r3) {
            com.google.android.gms.internal.ads.zzij r0 = new com.google.android.gms.internal.ads.zzij
            r1 = 2
            r0.<init>(r1, r2, r3)
            return r0
    }

    final com.google.android.gms.internal.ads.zzij zza(com.google.android.gms.internal.ads.zzuy r15) {
            r14 = this;
            com.google.android.gms.internal.ads.zzij r13 = new com.google.android.gms.internal.ads.zzij
            java.lang.String r1 = r14.getMessage()
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            long r10 = r14.zzb
            boolean r12 = r14.zzi
            java.lang.Throwable r2 = r14.getCause()
            int r3 = r14.zza
            int r4 = r14.zzc
            java.lang.String r5 = r14.zzd
            int r6 = r14.zze
            com.google.android.gms.internal.ads.zzaf r7 = r14.zzf
            int r8 = r14.zzg
            r0 = r13
            r9 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return r13
    }
}
