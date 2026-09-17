package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgkq implements com.google.android.gms.internal.ads.zzggt {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = null;
    private static final java.util.Set zzc = null;
    private final java.lang.String zzd;
    private final com.google.android.gms.internal.ads.zzggt zze;

    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            com.google.android.gms.internal.ads.zzgkq.zzb = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.AesGcmKey"
            r0.add(r1)
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"
            r0.add(r1)
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key"
            r0.add(r1)
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"
            r0.add(r1)
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.AesGcmSivKey"
            r0.add(r1)
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.AesEaxKey"
            r0.add(r1)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            com.google.android.gms.internal.ads.zzgkq.zzc = r0
            return
    }

    @java.lang.Deprecated
    zzgkq(com.google.android.gms.internal.ads.zzgwf r3, com.google.android.gms.internal.ads.zzggt r4) throws java.security.GeneralSecurityException {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = r3.zzi()
            java.util.Set r1 = com.google.android.gms.internal.ads.zzgkq.zzc
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L2e
            java.lang.String r0 = r3.zzi()
            r2.zzd = r0
            com.google.android.gms.internal.ads.zzgwe r3 = com.google.android.gms.internal.ads.zzgwf.zzc(r3)
            com.google.android.gms.internal.ads.zzgxf r0 = com.google.android.gms.internal.ads.zzgxf.zzd
            r3.zza(r0)
            com.google.android.gms.internal.ads.zzhbe r3 = r3.zzbn()
            com.google.android.gms.internal.ads.zzgwf r3 = (com.google.android.gms.internal.ads.zzgwf) r3
            byte[] r3 = r3.zzaV()
            com.google.android.gms.internal.ads.zzghy.zza(r3)
            r2.zze = r4
            return
        L2e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.zzi()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported DEK key type: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = ". Only Tink AEAD key types are supported."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    @Override // com.google.android.gms.internal.ads.zzggt
    public final byte[] zza(byte[] r7, byte[] r8) throws java.security.GeneralSecurityException {
            r6 = this;
            java.lang.String r0 = "invalid ciphertext"
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r7)     // Catch: java.lang.NegativeArraySizeException -> L61 java.nio.BufferUnderflowException -> L63 java.lang.IndexOutOfBoundsException -> L65
            int r2 = r1.getInt()     // Catch: java.lang.NegativeArraySizeException -> L61 java.nio.BufferUnderflowException -> L63 java.lang.IndexOutOfBoundsException -> L65
            if (r2 <= 0) goto L5b
            int r7 = r7.length     // Catch: java.lang.NegativeArraySizeException -> L61 java.nio.BufferUnderflowException -> L63 java.lang.IndexOutOfBoundsException -> L65
            int r7 = r7 + (-4)
            if (r2 > r7) goto L5b
            byte[] r7 = new byte[r2]     // Catch: java.lang.NegativeArraySizeException -> L61 java.nio.BufferUnderflowException -> L63 java.lang.IndexOutOfBoundsException -> L65
            r3 = 0
            r1.get(r7, r3, r2)     // Catch: java.lang.NegativeArraySizeException -> L61 java.nio.BufferUnderflowException -> L63 java.lang.IndexOutOfBoundsException -> L65
            int r2 = r1.remaining()     // Catch: java.lang.NegativeArraySizeException -> L61 java.nio.BufferUnderflowException -> L63 java.lang.IndexOutOfBoundsException -> L65
            byte[] r2 = new byte[r2]     // Catch: java.lang.NegativeArraySizeException -> L61 java.nio.BufferUnderflowException -> L63 java.lang.IndexOutOfBoundsException -> L65
            int r4 = r1.remaining()     // Catch: java.lang.NegativeArraySizeException -> L61 java.nio.BufferUnderflowException -> L63 java.lang.IndexOutOfBoundsException -> L65
            r1.get(r2, r3, r4)     // Catch: java.lang.NegativeArraySizeException -> L61 java.nio.BufferUnderflowException -> L63 java.lang.IndexOutOfBoundsException -> L65
            com.google.android.gms.internal.ads.zzggt r1 = r6.zze     // Catch: java.lang.NegativeArraySizeException -> L61 java.nio.BufferUnderflowException -> L63 java.lang.IndexOutOfBoundsException -> L65
            byte[] r4 = com.google.android.gms.internal.ads.zzgkq.zzb     // Catch: java.lang.NegativeArraySizeException -> L61 java.nio.BufferUnderflowException -> L63 java.lang.IndexOutOfBoundsException -> L65
            byte[] r7 = r1.zza(r7, r4)     // Catch: java.lang.NegativeArraySizeException -> L61 java.nio.BufferUnderflowException -> L63 java.lang.IndexOutOfBoundsException -> L65
            java.lang.String r1 = r6.zzd     // Catch: java.lang.NegativeArraySizeException -> L61 java.nio.BufferUnderflowException -> L63 java.lang.IndexOutOfBoundsException -> L65
            com.google.android.gms.internal.ads.zzgzs r4 = com.google.android.gms.internal.ads.zzgzs.zzb     // Catch: java.lang.NegativeArraySizeException -> L61 java.nio.BufferUnderflowException -> L63 java.lang.IndexOutOfBoundsException -> L65
            int r4 = r7.length     // Catch: java.lang.NegativeArraySizeException -> L61 java.nio.BufferUnderflowException -> L63 java.lang.IndexOutOfBoundsException -> L65
            com.google.android.gms.internal.ads.zzgzs r7 = com.google.android.gms.internal.ads.zzgzs.zzv(r7, r3, r4)     // Catch: java.lang.NegativeArraySizeException -> L61 java.nio.BufferUnderflowException -> L63 java.lang.IndexOutOfBoundsException -> L65
            com.google.android.gms.internal.ads.zzgwa r3 = com.google.android.gms.internal.ads.zzgwa.zzb     // Catch: java.lang.NegativeArraySizeException -> L61 java.nio.BufferUnderflowException -> L63 java.lang.IndexOutOfBoundsException -> L65
            com.google.android.gms.internal.ads.zzgxf r4 = com.google.android.gms.internal.ads.zzgxf.zzd     // Catch: java.lang.NegativeArraySizeException -> L61 java.nio.BufferUnderflowException -> L63 java.lang.IndexOutOfBoundsException -> L65
            r5 = 0
            com.google.android.gms.internal.ads.zzgqr r7 = com.google.android.gms.internal.ads.zzgqr.zza(r1, r7, r3, r4, r5)     // Catch: java.lang.NegativeArraySizeException -> L61 java.nio.BufferUnderflowException -> L63 java.lang.IndexOutOfBoundsException -> L65
            com.google.android.gms.internal.ads.zzgpq r1 = com.google.android.gms.internal.ads.zzgpq.zzc()     // Catch: java.lang.NegativeArraySizeException -> L61 java.nio.BufferUnderflowException -> L63 java.lang.IndexOutOfBoundsException -> L65
            com.google.android.gms.internal.ads.zzghw r3 = com.google.android.gms.internal.ads.zzghc.zza()     // Catch: java.lang.NegativeArraySizeException -> L61 java.nio.BufferUnderflowException -> L63 java.lang.IndexOutOfBoundsException -> L65
            com.google.android.gms.internal.ads.zzghd r7 = r1.zza(r7, r3)     // Catch: java.lang.NegativeArraySizeException -> L61 java.nio.BufferUnderflowException -> L63 java.lang.IndexOutOfBoundsException -> L65
            com.google.android.gms.internal.ads.zzgpn r1 = com.google.android.gms.internal.ads.zzgpn.zza()     // Catch: java.lang.NegativeArraySizeException -> L61 java.nio.BufferUnderflowException -> L63 java.lang.IndexOutOfBoundsException -> L65
            java.lang.Class<com.google.android.gms.internal.ads.zzggt> r3 = com.google.android.gms.internal.ads.zzggt.class
            java.lang.Object r7 = r1.zzc(r7, r3)     // Catch: java.lang.NegativeArraySizeException -> L61 java.nio.BufferUnderflowException -> L63 java.lang.IndexOutOfBoundsException -> L65
            com.google.android.gms.internal.ads.zzggt r7 = (com.google.android.gms.internal.ads.zzggt) r7     // Catch: java.lang.NegativeArraySizeException -> L61 java.nio.BufferUnderflowException -> L63 java.lang.IndexOutOfBoundsException -> L65
            byte[] r7 = r7.zza(r2, r8)     // Catch: java.lang.NegativeArraySizeException -> L61 java.nio.BufferUnderflowException -> L63 java.lang.IndexOutOfBoundsException -> L65
            return r7
        L5b:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException     // Catch: java.lang.NegativeArraySizeException -> L61 java.nio.BufferUnderflowException -> L63 java.lang.IndexOutOfBoundsException -> L65
            r7.<init>(r0)     // Catch: java.lang.NegativeArraySizeException -> L61 java.nio.BufferUnderflowException -> L63 java.lang.IndexOutOfBoundsException -> L65
            throw r7     // Catch: java.lang.NegativeArraySizeException -> L61 java.nio.BufferUnderflowException -> L63 java.lang.IndexOutOfBoundsException -> L65
        L61:
            r7 = move-exception
            goto L66
        L63:
            r7 = move-exception
            goto L66
        L65:
            r7 = move-exception
        L66:
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException
            r8.<init>(r0, r7)
            throw r8
    }
}
