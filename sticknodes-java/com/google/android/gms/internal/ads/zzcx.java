package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcx extends com.google.android.gms.internal.ads.zzcu {
    public zzcx() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zze(java.nio.ByteBuffer r12) {
            r11 = this;
            int r0 = r12.position()
            int r1 = r12.limit()
            int r2 = r1 - r0
            com.google.android.gms.internal.ads.zzcr r3 = r11.zzb
            int r3 = r3.zzd
            r4 = 1610612736(0x60000000, float:3.6893488E19)
            r5 = 1342177280(0x50000000, float:8.5899346E9)
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            r7 = 22
            r8 = 21
            r9 = 4
            r10 = 3
            if (r3 == r10) goto L35
            if (r3 == r9) goto L32
            if (r3 == r8) goto L2f
            if (r3 == r7) goto L32
            if (r3 == r6) goto L36
            if (r3 == r5) goto L2f
            if (r3 != r4) goto L29
            goto L32
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L2f:
            int r2 = r2 / 3
            goto L35
        L32:
            int r2 = r2 / 2
            goto L36
        L35:
            int r2 = r2 + r2
        L36:
            java.nio.ByteBuffer r2 = r11.zzj(r2)
            com.google.android.gms.internal.ads.zzcr r3 = r11.zzb
            int r3 = r3.zzd
            if (r3 == r10) goto Le9
            if (r3 == r9) goto Lbf
            if (r3 == r8) goto La8
            if (r3 == r7) goto L91
            if (r3 == r6) goto L7c
            if (r3 == r5) goto L67
            if (r3 != r4) goto L61
        L4c:
            if (r0 >= r1) goto Lfe
            int r3 = r0 + 1
            byte r3 = r12.get(r3)
            r2.put(r3)
            byte r3 = r12.get(r0)
            r2.put(r3)
            int r0 = r0 + 4
            goto L4c
        L61:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L67:
            if (r0 >= r1) goto Lfe
            int r3 = r0 + 1
            byte r3 = r12.get(r3)
            r2.put(r3)
            byte r3 = r12.get(r0)
            r2.put(r3)
            int r0 = r0 + 3
            goto L67
        L7c:
            if (r0 >= r1) goto Lfe
            int r3 = r0 + 1
            byte r3 = r12.get(r3)
            r2.put(r3)
            byte r3 = r12.get(r0)
            r2.put(r3)
            int r0 = r0 + 2
            goto L7c
        L91:
            if (r0 >= r1) goto Lfe
            int r3 = r0 + 2
            byte r3 = r12.get(r3)
            r2.put(r3)
            int r3 = r0 + 3
            byte r3 = r12.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L91
        La8:
            if (r0 >= r1) goto Lfe
            int r3 = r0 + 1
            byte r3 = r12.get(r3)
            r2.put(r3)
            int r3 = r0 + 2
            byte r3 = r12.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto La8
        Lbf:
            if (r0 >= r1) goto Lfe
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r12.getFloat(r0)
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = java.lang.Math.min(r4, r5)
            float r3 = java.lang.Math.max(r3, r4)
            r4 = 1191181824(0x46fffe00, float:32767.0)
            float r3 = r3 * r4
            int r3 = (int) r3
            short r3 = (short) r3
            r4 = r3 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r2.put(r4)
            int r3 = r3 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 4
            goto Lbf
        Le9:
            if (r0 >= r1) goto Lfe
            r3 = 0
            r2.put(r3)
            byte r3 = r12.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + (-128)
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto Le9
        Lfe:
            int r0 = r12.limit()
            r12.position(r0)
            r2.flip()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final com.google.android.gms.internal.ads.zzcr zzi(com.google.android.gms.internal.ads.zzcr r4) throws com.google.android.gms.internal.ads.zzcs {
            r3 = this;
            int r0 = r4.zzd
            r1 = 2
            r2 = 3
            if (r0 == r2) goto L2b
            if (r0 == r1) goto L28
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            if (r0 == r2) goto L2b
            r2 = 21
            if (r0 == r2) goto L2b
            r2 = 1342177280(0x50000000, float:8.5899346E9)
            if (r0 == r2) goto L2b
            r2 = 22
            if (r0 == r2) goto L2b
            r2 = 1610612736(0x60000000, float:3.6893488E19)
            if (r0 == r2) goto L2b
            r2 = 4
            if (r0 != r2) goto L20
            goto L2b
        L20:
            com.google.android.gms.internal.ads.zzcs r0 = new com.google.android.gms.internal.ads.zzcs
            java.lang.String r1 = "Unhandled input format:"
            r0.<init>(r1, r4)
            throw r0
        L28:
            com.google.android.gms.internal.ads.zzcr r4 = com.google.android.gms.internal.ads.zzcr.zza
            goto L35
        L2b:
            com.google.android.gms.internal.ads.zzcr r0 = new com.google.android.gms.internal.ads.zzcr
            int r2 = r4.zzb
            int r4 = r4.zzc
            r0.<init>(r2, r4, r1)
            r4 = r0
        L35:
            return r4
    }
}
