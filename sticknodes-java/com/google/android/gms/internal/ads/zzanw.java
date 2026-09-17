package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzanw extends com.google.android.gms.internal.ads.zzacm {
    public zzanw(com.google.android.gms.internal.ads.zzer r17, long r18, long r20) {
            r16 = this;
            com.google.android.gms.internal.ads.zzach r1 = new com.google.android.gms.internal.ads.zzach
            r1.<init>()
            com.google.android.gms.internal.ads.zzanv r2 = new com.google.android.gms.internal.ads.zzanv
            r0 = 0
            r3 = r17
            r2.<init>(r3, r0)
            r3 = 1
            long r7 = r18 + r3
            r5 = 0
            r9 = 0
            r13 = 188(0xbc, double:9.3E-322)
            r15 = 1000(0x3e8, float:1.401E-42)
            r0 = r16
            r3 = r18
            r11 = r20
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13, r15)
            return
    }

    static /* bridge */ /* synthetic */ int zzh(byte[] r3, int r4) {
            r0 = r3[r4]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r4 + 1
            r1 = r3[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = r4 + 2
            r2 = r3[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r4 = r4 + 3
            r3 = r3[r4]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r0 << 24
            int r0 = r1 << 16
            r4 = r4 | r0
            int r0 = r2 << 8
            r4 = r4 | r0
            r3 = r3 | r4
            return r3
    }
}
