package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaro {
    public static double zza(java.nio.ByteBuffer r4) {
            r0 = 4
            byte[] r0 = new byte[r0]
            r4.get(r0)
            r4 = 0
            r4 = r0[r4]
            int r4 = r4 << 24
            r1 = 1
            r1 = r0[r1]
            int r1 = r1 << 16
            r2 = 2
            r2 = r0[r2]
            int r2 = r2 << 8
            r3 = 3
            r0 = r0[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r4 = r4 & r3
            r3 = 16711680(0xff0000, float:2.3418052E-38)
            r1 = r1 & r3
            r4 = r4 | r1
            r1 = 65280(0xff00, float:9.1477E-41)
            r1 = r1 & r2
            r4 = r4 | r1
            r4 = r4 | r0
            double r0 = (double) r4
            r2 = 4742290407621132288(0x41d0000000000000, double:1.073741824E9)
            double r0 = r0 / r2
            return r0
    }

    public static double zzb(java.nio.ByteBuffer r4) {
            r0 = 4
            byte[] r0 = new byte[r0]
            r4.get(r0)
            r4 = 0
            r4 = r0[r4]
            int r4 = r4 << 24
            r1 = 1
            r1 = r0[r1]
            int r1 = r1 << 16
            r2 = 2
            r2 = r0[r2]
            int r2 = r2 << 8
            r3 = 3
            r0 = r0[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r4 = r4 & r3
            r3 = 16711680(0xff0000, float:2.3418052E-38)
            r1 = r1 & r3
            r4 = r4 | r1
            r1 = 65280(0xff00, float:9.1477E-41)
            r1 = r1 & r2
            r4 = r4 | r1
            r4 = r4 | r0
            double r0 = (double) r4
            r2 = 4679240012837945344(0x40f0000000000000, double:65536.0)
            double r0 = r0 / r2
            return r0
    }

    public static int zzc(byte r0) {
            if (r0 >= 0) goto L4
            int r0 = r0 + 256
        L4:
            return r0
    }

    public static int zzd(java.nio.ByteBuffer r1) {
            byte r0 = r1.get()
            int r0 = zzc(r0)
            byte r1 = r1.get()
            int r1 = zzc(r1)
            int r0 = r0 << 8
            int r0 = r0 + r1
            return r0
    }

    public static long zze(java.nio.ByteBuffer r4) {
            int r4 = r4.getInt()
            long r0 = (long) r4
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L11
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            long r0 = r0 + r2
        L11:
            return r0
    }

    public static long zzf(java.nio.ByteBuffer r5) {
            long r0 = zze(r5)
            r2 = 32
            long r0 = r0 << r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L13
            long r2 = zze(r5)
            long r0 = r0 + r2
            return r0
        L13:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r0 = "I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt"
            r5.<init>(r0)
            throw r5
    }
}
