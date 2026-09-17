package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzhbu extends java.io.InputStream {
    private java.util.Iterator zza;
    private java.nio.ByteBuffer zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private boolean zzf;
    private byte[] zzg;
    private int zzh;
    private long zzi;

    zzhbu(java.lang.Iterable r3) {
            r2 = this;
            r2.<init>()
            java.util.Iterator r0 = r3.iterator()
            r2.zza = r0
            r0 = 0
            r2.zzc = r0
            java.util.Iterator r3 = r3.iterator()
        L10:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r3.next()
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r1 = r2.zzc
            int r1 = r1 + 1
            r2.zzc = r1
            goto L10
        L23:
            r3 = -1
            r2.zzd = r3
            boolean r3 = r2.zzb()
            if (r3 != 0) goto L38
            java.nio.ByteBuffer r3 = com.google.android.gms.internal.ads.zzhbr.zzc
            r2.zzb = r3
            r2.zzd = r0
            r2.zze = r0
            r0 = 0
            r2.zzi = r0
        L38:
            return
    }

    private final void zza(int r2) {
            r1 = this;
            int r0 = r1.zze
            int r0 = r0 + r2
            r1.zze = r0
            java.nio.ByteBuffer r2 = r1.zzb
            int r2 = r2.limit()
            if (r0 != r2) goto L10
            r1.zzb()
        L10:
            return
    }

    private final boolean zzb() {
            r4 = this;
            int r0 = r4.zzd
            r1 = 1
            int r0 = r0 + r1
            r4.zzd = r0
            java.util.Iterator r0 = r4.zza
            boolean r0 = r0.hasNext()
            r2 = 0
            if (r0 != 0) goto L10
            return r2
        L10:
            java.util.Iterator r0 = r4.zza
            java.lang.Object r0 = r0.next()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r4.zzb = r0
            int r0 = r0.position()
            r4.zze = r0
            java.nio.ByteBuffer r0 = r4.zzb
            boolean r0 = r0.hasArray()
            if (r0 == 0) goto L3b
            r4.zzf = r1
            java.nio.ByteBuffer r0 = r4.zzb
            byte[] r0 = r0.array()
            r4.zzg = r0
            java.nio.ByteBuffer r0 = r4.zzb
            int r0 = r0.arrayOffset()
            r4.zzh = r0
            goto L48
        L3b:
            r4.zzf = r2
            java.nio.ByteBuffer r0 = r4.zzb
            long r2 = com.google.android.gms.internal.ads.zzhef.zze(r0)
            r4.zzi = r2
            r0 = 0
            r4.zzg = r0
        L48:
            return r1
    }

    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
            r6 = this;
            int r0 = r6.zzd
            int r1 = r6.zzc
            if (r0 != r1) goto L8
            r0 = -1
            return r0
        L8:
            boolean r0 = r6.zzf
            r1 = 1
            if (r0 == 0) goto L1c
            byte[] r0 = r6.zzg
            int r2 = r6.zze
            int r3 = r6.zzh
            int r2 = r2 + r3
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r6.zza(r1)
            return r0
        L1c:
            int r0 = r6.zze
            long r2 = (long) r0
            long r4 = r6.zzi
            long r2 = r2 + r4
            byte r0 = com.google.android.gms.internal.ads.zzhef.zza(r2)
            r0 = r0 & 255(0xff, float:3.57E-43)
            r6.zza(r1)
            return r0
    }

    @Override // java.io.InputStream
    public final int read(byte[] r4, int r5, int r6) throws java.io.IOException {
            r3 = this;
            int r0 = r3.zzd
            int r1 = r3.zzc
            if (r0 != r1) goto L8
            r4 = -1
            return r4
        L8:
            java.nio.ByteBuffer r0 = r3.zzb
            int r0 = r0.limit()
            int r1 = r3.zze
            int r0 = r0 - r1
            if (r6 <= r0) goto L14
            r6 = r0
        L14:
            boolean r0 = r3.zzf
            if (r0 == 0) goto L24
            byte[] r0 = r3.zzg
            int r2 = r3.zzh
            int r1 = r1 + r2
            java.lang.System.arraycopy(r0, r1, r4, r5, r6)
            r3.zza(r6)
            goto L3e
        L24:
            java.nio.ByteBuffer r0 = r3.zzb
            int r0 = r0.position()
            java.nio.ByteBuffer r1 = r3.zzb
            int r2 = r3.zze
            r1.position(r2)
            java.nio.ByteBuffer r1 = r3.zzb
            r1.get(r4, r5, r6)
            java.nio.ByteBuffer r4 = r3.zzb
            r4.position(r0)
            r3.zza(r6)
        L3e:
            return r6
    }
}
