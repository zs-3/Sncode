package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzhj extends com.google.android.gms.internal.ads.zzfz {
    private final byte[] zza;
    private final java.net.DatagramPacket zzb;
    private android.net.Uri zzc;
    private java.net.DatagramSocket zzd;
    private java.net.MulticastSocket zze;
    private java.net.InetAddress zzf;
    private boolean zzg;
    private int zzh;

    public zzhj() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public zzhj(int r4) {
            r3 = this;
            r4 = 1
            r3.<init>(r4)
            r4 = 2000(0x7d0, float:2.803E-42)
            byte[] r0 = new byte[r4]
            r3.zza = r0
            java.net.DatagramPacket r1 = new java.net.DatagramPacket
            r2 = 0
            r1.<init>(r0, r2, r4)
            r3.zzb = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] r3, int r4, int r5) throws com.google.android.gms.internal.ads.zzhi {
            r2 = this;
            if (r5 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r2.zzh
            if (r0 != 0) goto L30
            java.net.DatagramSocket r0 = r2.zzd     // Catch: java.io.IOException -> L1e java.net.SocketTimeoutException -> L27
            java.util.Objects.requireNonNull(r0)
            java.net.DatagramPacket r1 = r2.zzb     // Catch: java.io.IOException -> L1e java.net.SocketTimeoutException -> L27
            r0.receive(r1)     // Catch: java.io.IOException -> L1e java.net.SocketTimeoutException -> L27
            java.net.DatagramPacket r0 = r2.zzb
            int r0 = r0.getLength()
            r2.zzh = r0
            r2.zzg(r0)
            goto L30
        L1e:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzhi r4 = new com.google.android.gms.internal.ads.zzhi
            r5 = 2001(0x7d1, float:2.804E-42)
            r4.<init>(r3, r5)
            throw r4
        L27:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzhi r4 = new com.google.android.gms.internal.ads.zzhi
            r5 = 2002(0x7d2, float:2.805E-42)
            r4.<init>(r3, r5)
            throw r4
        L30:
            java.net.DatagramPacket r0 = r2.zzb
            int r0 = r0.getLength()
            int r1 = r2.zzh
            int r0 = r0 - r1
            int r5 = java.lang.Math.min(r1, r5)
            byte[] r1 = r2.zza
            java.lang.System.arraycopy(r1, r0, r3, r4, r5)
            int r3 = r2.zzh
            int r3 = r3 - r5
            r2.zzh = r3
            return r5
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final long zzb(com.google.android.gms.internal.ads.zzgm r4) throws com.google.android.gms.internal.ads.zzhi {
            r3 = this;
            android.net.Uri r0 = r4.zza
            r3.zzc = r0
            java.lang.String r0 = r0.getHost()
            java.util.Objects.requireNonNull(r0)
            android.net.Uri r1 = r3.zzc
            int r1 = r1.getPort()
            r3.zzi(r4)
            java.net.InetAddress r0 = java.net.InetAddress.getByName(r0)     // Catch: java.io.IOException -> L51 java.lang.SecurityException -> L5a
            r3.zzf = r0     // Catch: java.io.IOException -> L51 java.lang.SecurityException -> L5a
            java.net.InetSocketAddress r0 = new java.net.InetSocketAddress     // Catch: java.io.IOException -> L51 java.lang.SecurityException -> L5a
            java.net.InetAddress r2 = r3.zzf     // Catch: java.io.IOException -> L51 java.lang.SecurityException -> L5a
            r0.<init>(r2, r1)     // Catch: java.io.IOException -> L51 java.lang.SecurityException -> L5a
            java.net.InetAddress r1 = r3.zzf     // Catch: java.io.IOException -> L51 java.lang.SecurityException -> L5a
            boolean r1 = r1.isMulticastAddress()     // Catch: java.io.IOException -> L51 java.lang.SecurityException -> L5a
            if (r1 == 0) goto L3a
            java.net.MulticastSocket r1 = new java.net.MulticastSocket     // Catch: java.io.IOException -> L51 java.lang.SecurityException -> L5a
            r1.<init>(r0)     // Catch: java.io.IOException -> L51 java.lang.SecurityException -> L5a
            r3.zze = r1     // Catch: java.io.IOException -> L51 java.lang.SecurityException -> L5a
            java.net.InetAddress r0 = r3.zzf     // Catch: java.io.IOException -> L51 java.lang.SecurityException -> L5a
            r1.joinGroup(r0)     // Catch: java.io.IOException -> L51 java.lang.SecurityException -> L5a
            java.net.MulticastSocket r0 = r3.zze     // Catch: java.io.IOException -> L51 java.lang.SecurityException -> L5a
            r3.zzd = r0     // Catch: java.io.IOException -> L51 java.lang.SecurityException -> L5a
            goto L41
        L3a:
            java.net.DatagramSocket r1 = new java.net.DatagramSocket     // Catch: java.io.IOException -> L51 java.lang.SecurityException -> L5a
            r1.<init>(r0)     // Catch: java.io.IOException -> L51 java.lang.SecurityException -> L5a
            r3.zzd = r1     // Catch: java.io.IOException -> L51 java.lang.SecurityException -> L5a
        L41:
            java.net.DatagramSocket r0 = r3.zzd     // Catch: java.io.IOException -> L51 java.lang.SecurityException -> L5a
            r1 = 8000(0x1f40, float:1.121E-41)
            r0.setSoTimeout(r1)     // Catch: java.io.IOException -> L51 java.lang.SecurityException -> L5a
            r0 = 1
            r3.zzg = r0
            r3.zzj(r4)
            r0 = -1
            return r0
        L51:
            r4 = move-exception
            com.google.android.gms.internal.ads.zzhi r0 = new com.google.android.gms.internal.ads.zzhi
            r1 = 2001(0x7d1, float:2.804E-42)
            r0.<init>(r4, r1)
            throw r0
        L5a:
            r4 = move-exception
            com.google.android.gms.internal.ads.zzhi r0 = new com.google.android.gms.internal.ads.zzhi
            r1 = 2006(0x7d6, float:2.811E-42)
            r0.<init>(r4, r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final android.net.Uri zzc() {
            r1 = this;
            android.net.Uri r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void zzd() {
            r3 = this;
            r0 = 0
            r3.zzc = r0
            java.net.MulticastSocket r1 = r3.zze
            if (r1 == 0) goto L11
            java.net.InetAddress r2 = r3.zzf     // Catch: java.io.IOException -> Lf
            java.util.Objects.requireNonNull(r2)
            r1.leaveGroup(r2)     // Catch: java.io.IOException -> Lf
        Lf:
            r3.zze = r0
        L11:
            java.net.DatagramSocket r1 = r3.zzd
            if (r1 == 0) goto L1a
            r1.close()
            r3.zzd = r0
        L1a:
            r3.zzf = r0
            r0 = 0
            r3.zzh = r0
            boolean r1 = r3.zzg
            if (r1 == 0) goto L28
            r3.zzg = r0
            r3.zzh()
        L28:
            return
    }
}
