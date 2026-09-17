package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzafz {
    private final java.io.ByteArrayOutputStream zza;
    private final java.io.DataOutputStream zzb;

    public zzafz() {
            r2 = this;
            r2.<init>()
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = 512(0x200, float:7.175E-43)
            r0.<init>(r1)
            r2.zza = r0
            java.io.DataOutputStream r1 = new java.io.DataOutputStream
            r1.<init>(r0)
            r2.zzb = r1
            return
    }

    private static void zzb(java.io.DataOutputStream r0, java.lang.String r1) throws java.io.IOException {
            r0.writeBytes(r1)
            r1 = 0
            r0.writeByte(r1)
            return
    }

    public final byte[] zza(com.google.android.gms.internal.ads.zzafy r4) {
            r3 = this;
            java.io.ByteArrayOutputStream r0 = r3.zza
            r0.reset()
            java.io.DataOutputStream r0 = r3.zzb     // Catch: java.io.IOException -> L38
            java.lang.String r1 = r4.zza     // Catch: java.io.IOException -> L38
            zzb(r0, r1)     // Catch: java.io.IOException -> L38
            java.lang.String r0 = r4.zzb     // Catch: java.io.IOException -> L38
            if (r0 != 0) goto L12
            java.lang.String r0 = ""
        L12:
            java.io.DataOutputStream r1 = r3.zzb     // Catch: java.io.IOException -> L38
            zzb(r1, r0)     // Catch: java.io.IOException -> L38
            java.io.DataOutputStream r0 = r3.zzb     // Catch: java.io.IOException -> L38
            long r1 = r4.zzc     // Catch: java.io.IOException -> L38
            r0.writeLong(r1)     // Catch: java.io.IOException -> L38
            java.io.DataOutputStream r0 = r3.zzb     // Catch: java.io.IOException -> L38
            long r1 = r4.zzd     // Catch: java.io.IOException -> L38
            r0.writeLong(r1)     // Catch: java.io.IOException -> L38
            java.io.DataOutputStream r0 = r3.zzb     // Catch: java.io.IOException -> L38
            byte[] r4 = r4.zze     // Catch: java.io.IOException -> L38
            r0.write(r4)     // Catch: java.io.IOException -> L38
            java.io.DataOutputStream r4 = r3.zzb     // Catch: java.io.IOException -> L38
            r4.flush()     // Catch: java.io.IOException -> L38
            java.io.ByteArrayOutputStream r4 = r3.zza     // Catch: java.io.IOException -> L38
            byte[] r4 = r4.toByteArray()     // Catch: java.io.IOException -> L38
            return r4
        L38:
            r4 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r4)
            throw r0
    }
}
