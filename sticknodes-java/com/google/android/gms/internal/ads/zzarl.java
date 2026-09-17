package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzarl implements com.google.android.gms.internal.ads.zzarm {
    private static final java.util.logging.Logger zzb = null;
    final java.lang.ThreadLocal zza;

    static {
            java.lang.Class<com.google.android.gms.internal.ads.zzarl> r0 = com.google.android.gms.internal.ads.zzarl.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.android.gms.internal.ads.zzarl.zzb = r0
            return
    }

    public zzarl() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzark r0 = new com.google.android.gms.internal.ads.zzark
            r0.<init>(r1)
            r1.zza = r0
            return
    }

    public abstract com.google.android.gms.internal.ads.zzarp zza(java.lang.String r1, byte[] r2, java.lang.String r3);

    @Override // com.google.android.gms.internal.ads.zzarm
    public final com.google.android.gms.internal.ads.zzarp zzb(com.google.android.gms.internal.ads.zzhhu r12, com.google.android.gms.internal.ads.zzarq r13) throws java.io.IOException {
            r11 = this;
            long r0 = r12.zzb()
            java.lang.ThreadLocal r2 = r11.zza
            java.lang.Object r2 = r2.get()
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            java.nio.Buffer r2 = r2.rewind()
            r3 = 8
            r2.limit(r3)
        L15:
            java.lang.ThreadLocal r2 = r11.zza
            java.lang.Object r2 = r2.get()
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            int r2 = r12.zza(r2)
            if (r2 == r3) goto L2f
            if (r2 < 0) goto L26
            goto L15
        L26:
            r12.zze(r0)
            java.io.EOFException r12 = new java.io.EOFException
            r12.<init>()
            throw r12
        L2f:
            java.lang.ThreadLocal r0 = r11.zza
            java.lang.Object r0 = r0.get()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r0.rewind()
            java.lang.ThreadLocal r0 = r11.zza
            java.lang.Object r0 = r0.get()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            long r0 = com.google.android.gms.internal.ads.zzaro.zze(r0)
            r4 = 8
            r2 = 0
            r6 = 1
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 >= 0) goto L78
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 > 0) goto L54
            goto L78
        L54:
            java.util.logging.Logger r12 = com.google.android.gms.internal.ads.zzarl.zzb
            java.util.logging.Level r13 = java.util.logging.Level.SEVERE
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 80
            r3.<init>(r4)
            java.lang.String r4 = "Plausibility check failed: size < 8 (size = "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = "). Stop parsing!"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = "com.coremedia.iso.AbstractBoxParser"
            java.lang.String r3 = "parseBox"
            r12.logp(r13, r1, r3, r0)
            return r2
        L78:
            java.lang.ThreadLocal r4 = r11.zza
            java.lang.Object r4 = r4.get()
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            r5 = 4
            byte[] r5 = new byte[r5]
            r4.get(r5)
            java.lang.String r4 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L16f
            java.lang.String r8 = "ISO-8859-1"
            r4.<init>(r5, r8)     // Catch: java.io.UnsupportedEncodingException -> L16f
            r8 = -16
            r5 = 16
            int r10 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r10 != 0) goto Lc4
            java.lang.ThreadLocal r0 = r11.zza
            java.lang.Object r0 = r0.get()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r0.limit(r5)
            java.lang.ThreadLocal r0 = r11.zza
            java.lang.Object r0 = r0.get()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r12.zza(r0)
            java.lang.ThreadLocal r0 = r11.zza
            java.lang.Object r0 = r0.get()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r0.position(r3)
            java.lang.ThreadLocal r0 = r11.zza
            java.lang.Object r0 = r0.get()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            long r0 = com.google.android.gms.internal.ads.zzaro.zzf(r0)
            long r0 = r0 + r8
            goto Ld7
        Lc4:
            r6 = 0
            int r3 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r3 != 0) goto Ld4
            long r0 = r12.zzc()
            long r6 = r12.zzb()
            long r0 = r0 - r6
            goto Ld7
        Ld4:
            r6 = -8
            long r0 = r0 + r6
        Ld7:
            java.lang.String r3 = "uuid"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L142
            java.lang.ThreadLocal r2 = r11.zza
            java.lang.Object r2 = r2.get()
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            java.lang.ThreadLocal r3 = r11.zza
            java.lang.Object r3 = r3.get()
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r3 = r3.limit()
            int r3 = r3 + r5
            r2.limit(r3)
            java.lang.ThreadLocal r2 = r11.zza
            java.lang.Object r2 = r2.get()
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            r12.zza(r2)
            byte[] r2 = new byte[r5]
            java.lang.ThreadLocal r3 = r11.zza
            java.lang.Object r3 = r3.get()
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r3 = r3.position()
            int r3 = r3 + (-16)
        L112:
            java.lang.ThreadLocal r5 = r11.zza
            java.lang.Object r5 = r5.get()
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            int r5 = r5.position()
            if (r3 >= r5) goto L141
            java.lang.ThreadLocal r5 = r11.zza
            java.lang.Object r5 = r5.get()
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            int r5 = r5.position()
            int r5 = r5 + (-16)
            java.lang.ThreadLocal r6 = r11.zza
            java.lang.Object r6 = r6.get()
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            byte r6 = r6.get(r3)
            int r5 = r3 - r5
            r2[r5] = r6
            int r3 = r3 + 1
            goto L112
        L141:
            long r0 = r0 + r8
        L142:
            r8 = r0
            boolean r0 = r13 instanceof com.google.android.gms.internal.ads.zzarp
            if (r0 == 0) goto L14e
            com.google.android.gms.internal.ads.zzarp r13 = (com.google.android.gms.internal.ads.zzarp) r13
            java.lang.String r13 = r13.zza()
            goto L150
        L14e:
            java.lang.String r13 = ""
        L150:
            com.google.android.gms.internal.ads.zzarp r13 = r11.zza(r4, r2, r13)
            java.lang.ThreadLocal r0 = r11.zza
            java.lang.Object r0 = r0.get()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r0.rewind()
            java.lang.ThreadLocal r0 = r11.zza
            java.lang.Object r0 = r0.get()
            r7 = r0
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            r5 = r13
            r6 = r12
            r10 = r11
            r5.zzb(r6, r7, r8, r10)
            return r13
        L16f:
            r12 = move-exception
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            r13.<init>(r12)
            throw r13
    }
}
