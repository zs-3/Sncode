package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzazz {
    private final int zza;
    private final com.google.android.gms.internal.ads.zzazw zzb;

    public zzazz(int r2) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzbab r0 = new com.google.android.gms.internal.ads.zzbab
            r0.<init>()
            r1.zzb = r0
            r1.zza = r2
            return
    }

    public final java.lang.String zza(java.util.ArrayList r8) {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r8.size()
            r2 = 0
            r3 = 0
        Lb:
            if (r3 >= r1) goto L24
            java.lang.Object r4 = r8.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r5 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r5)
            r0.append(r4)
            r4 = 10
            r0.append(r4)
            int r3 = r3 + 1
            goto Lb
        L24:
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = "\n"
            java.lang.String[] r8 = r8.split(r0)
            int r0 = r8.length
            if (r0 != 0) goto L34
            java.lang.String r8 = ""
            goto L83
        L34:
            com.google.android.gms.internal.ads.zzazy r0 = new com.google.android.gms.internal.ads.zzazy
            r0.<init>()
            int r1 = r7.zza
            java.util.PriorityQueue r3 = new java.util.PriorityQueue
            com.google.android.gms.internal.ads.zzazx r4 = new com.google.android.gms.internal.ads.zzazx
            r4.<init>(r7)
            r3.<init>(r1, r4)
            r1 = 0
        L46:
            int r4 = r8.length
            if (r1 >= r4) goto L5b
            r4 = r8[r1]
            java.lang.String[] r4 = com.google.android.gms.internal.ads.zzbaa.zzb(r4, r2)
            int r5 = r4.length
            if (r5 == 0) goto L58
            int r5 = r7.zza
            r6 = 6
            com.google.android.gms.internal.ads.zzbae.zzc(r4, r5, r6, r3)
        L58:
            int r1 = r1 + 1
            goto L46
        L5b:
            java.util.Iterator r8 = r3.iterator()
        L5f:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L7f
            java.lang.Object r1 = r8.next()
            com.google.android.gms.internal.ads.zzbad r1 = (com.google.android.gms.internal.ads.zzbad) r1
            com.google.android.gms.internal.ads.zzazw r2 = r7.zzb     // Catch: java.io.IOException -> L79
            java.lang.String r1 = r1.zzb     // Catch: java.io.IOException -> L79
            byte[] r1 = r2.zzb(r1)     // Catch: java.io.IOException -> L79
            android.util.Base64OutputStream r2 = r0.zzb     // Catch: java.io.IOException -> L79
            r2.write(r1)     // Catch: java.io.IOException -> L79
            goto L5f
        L79:
            r8 = move-exception
            java.lang.String r1 = "Error while writing hash to byteStream"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r8)
        L7f:
            java.lang.String r8 = r0.toString()
        L83:
            return r8
    }
}
