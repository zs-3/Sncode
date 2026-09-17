package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
@java.lang.Deprecated
/* loaded from: classes.dex */
public final class zzbda {
    final java.util.concurrent.BlockingQueue zza;
    final java.util.LinkedHashMap zzb;
    final java.util.Map zzc;
    java.lang.String zzd;
    android.content.Context zze;
    java.lang.String zzf;
    private final java.util.HashSet zzg;
    private java.util.concurrent.atomic.AtomicBoolean zzh;
    private java.io.File zzi;

    public zzbda() {
            r5 = this;
            r5.<init>()
            java.util.concurrent.ArrayBlockingQueue r0 = new java.util.concurrent.ArrayBlockingQueue
            r1 = 100
            r0.<init>(r1)
            r5.zza = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r5.zzb = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.zzc = r0
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = "noop"
            java.lang.String r2 = "activeViewPingSent"
            java.lang.String r3 = "viewabilityChanged"
            java.lang.String r4 = "visibilityChanged"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            r5.zzg = r0
            return
    }

    public static /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzbda r3) {
        L0:
            java.util.concurrent.BlockingQueue r0 = r3.zza     // Catch: java.lang.InterruptedException -> L24
            java.lang.Object r0 = r0.take()     // Catch: java.lang.InterruptedException -> L24
            com.google.android.gms.internal.ads.zzbdk r0 = (com.google.android.gms.internal.ads.zzbdk) r0     // Catch: java.lang.InterruptedException -> L24
            com.google.android.gms.internal.ads.zzbdj r1 = r0.zza()     // Catch: java.lang.InterruptedException -> L24
            java.lang.String r2 = r1.zzb()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L0
            java.util.LinkedHashMap r2 = r3.zzb
            java.util.Map r0 = r0.zzb()
            java.util.Map r0 = r3.zzb(r2, r0)
            r3.zzg(r0, r1)
            goto L0
        L24:
            r3 = move-exception
            java.lang.String r0 = "CsiReporter:reporter interrupted"
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r0, r3)
            return
    }

    private final void zzg(java.util.Map r5, com.google.android.gms.internal.ads.zzbdj r6) {
            r4 = this;
            java.lang.String r0 = "CsiReporter: Cannot close file: sdk_csi_data.txt."
            java.lang.String r1 = r4.zzd
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.net.Uri$Builder r1 = r1.buildUpon()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L14:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r1.appendQueryParameter(r3, r2)
            goto L14
        L30:
            android.net.Uri r5 = r1.build()
            java.lang.String r5 = r5.toString()
            if (r6 == 0) goto L6f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            java.lang.String r5 = r6.zzb()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L55
            java.lang.String r5 = "&it="
            r1.append(r5)
            java.lang.String r5 = r6.zzb()
            r1.append(r5)
        L55:
            java.lang.String r5 = r6.zza()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L6b
            java.lang.String r5 = "&blat="
            r1.append(r5)
            java.lang.String r5 = r6.zza()
            r1.append(r5)
        L6b:
            java.lang.String r5 = r1.toString()
        L6f:
            java.util.concurrent.atomic.AtomicBoolean r6 = r4.zzh
            boolean r6 = r6.get()
            if (r6 == 0) goto Lc1
            java.io.File r6 = r4.zzi
            if (r6 == 0) goto Lbb
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
            r3 = 1
            r2.<init>(r6, r3)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
            byte[] r5 = r5.getBytes()     // Catch: java.lang.Throwable -> L97 java.io.IOException -> L9a
            r2.write(r5)     // Catch: java.lang.Throwable -> L97 java.io.IOException -> L9a
            r5 = 10
            r2.write(r5)     // Catch: java.lang.Throwable -> L97 java.io.IOException -> L9a
            r2.close()     // Catch: java.io.IOException -> L92
            return
        L92:
            r5 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r0, r5)
            return
        L97:
            r5 = move-exception
            r1 = r2
            goto Lb0
        L9a:
            r5 = move-exception
            r1 = r2
            goto La0
        L9d:
            r5 = move-exception
            goto Lb0
        L9f:
            r5 = move-exception
        La0:
            java.lang.String r6 = "CsiReporter: Cannot write to file: sdk_csi_data.txt."
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r6, r5)     // Catch: java.lang.Throwable -> L9d
            if (r1 == 0) goto Laf
            r1.close()     // Catch: java.io.IOException -> Lab
            return
        Lab:
            r5 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r0, r5)
        Laf:
            return
        Lb0:
            if (r1 == 0) goto Lba
            r1.close()     // Catch: java.io.IOException -> Lb6
            goto Lba
        Lb6:
            r6 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r0, r6)
        Lba:
            throw r5
        Lbb:
            java.lang.String r5 = "CsiReporter: File doesn't exist. Cannot write CSI data to file."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r5)
            return
        Lc1:
            com.google.android.gms.ads.internal.zzu.zzp()
            android.content.Context r6 = r4.zze
            java.lang.String r0 = r4.zzf
            com.google.android.gms.ads.internal.util.zzt.zzL(r6, r0, r5)
            return
    }

    public final com.google.android.gms.internal.ads.zzbdg zza(java.lang.String r2) {
            r1 = this;
            java.util.Map r0 = r1.zzc
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.internal.ads.zzbdg r2 = (com.google.android.gms.internal.ads.zzbdg) r2
            if (r2 == 0) goto Lb
            return r2
        Lb:
            com.google.android.gms.internal.ads.zzbdg r2 = com.google.android.gms.internal.ads.zzbdg.zza
            return r2
    }

    final java.util.Map zzb(java.util.Map r5, java.util.Map r6) {
            r4 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r5)
            java.util.Set r5 = r6.entrySet()
            java.util.Iterator r5 = r5.iterator()
        Ld:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L37
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r1 = r6.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r6 = r6.getValue()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r2 = r0.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.gms.internal.ads.zzbdg r3 = r4.zza(r1)
            java.lang.String r6 = r3.zza(r2, r6)
            r0.put(r1, r6)
            goto Ld
        L37:
            return r0
    }

    public final void zzd(android.content.Context r2, java.lang.String r3, java.lang.String r4, java.util.Map r5) {
            r1 = this;
            r1.zze = r2
            r1.zzf = r3
            r1.zzd = r4
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r3 = 0
            r2.<init>(r3)
            r1.zzh = r2
            com.google.android.gms.internal.ads.zzbeb r3 = com.google.android.gms.internal.ads.zzbem.zzc
            java.lang.Object r3 = r3.zze()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r2.set(r3)
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.zzh
            boolean r2 = r2.get()
            if (r2 == 0) goto L3c
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()
            if (r2 == 0) goto L3c
            java.io.File r3 = new java.io.File
            com.google.android.gms.internal.ads.zzftn r4 = com.google.android.gms.internal.ads.zzftl.zza()
            java.lang.String r0 = "sdk_csi_data.txt"
            java.lang.String r2 = com.google.android.gms.internal.ads.zzftm.zza(r4, r2, r0)
            r3.<init>(r2)
            r1.zzi = r3
        L3c:
            java.util.Set r2 = r5.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L44:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L62
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.util.LinkedHashMap r4 = r1.zzb
            java.lang.Object r5 = r3.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r4.put(r5, r3)
            goto L44
        L62:
            com.google.android.gms.internal.ads.zzgfz r2 = com.google.android.gms.internal.ads.zzcan.zza
            com.google.android.gms.internal.ads.zzbcz r3 = new com.google.android.gms.internal.ads.zzbcz
            r3.<init>(r1)
            r2.execute(r3)
            java.util.Map r2 = r1.zzc
            com.google.android.gms.internal.ads.zzbdg r3 = com.google.android.gms.internal.ads.zzbdg.zzb
            java.lang.String r4 = "action"
            r2.put(r4, r3)
            java.util.Map r2 = r1.zzc
            java.lang.String r4 = "ad_format"
            r2.put(r4, r3)
            java.util.Map r2 = r1.zzc
            com.google.android.gms.internal.ads.zzbdg r3 = com.google.android.gms.internal.ads.zzbdg.zzc
            java.lang.String r4 = "e"
            r2.put(r4, r3)
            return
    }

    public final void zze(java.lang.String r4) {
            r3 = this;
            java.util.HashSet r0 = r3.zzg
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L9
            return
        L9:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.String r1 = r3.zzf
            java.lang.String r2 = "sdkVersion"
            r0.put(r2, r1)
            java.lang.String r1 = "ue"
            r0.put(r1, r4)
            java.util.LinkedHashMap r4 = r3.zzb
            java.util.Map r4 = r3.zzb(r4, r0)
            r0 = 0
            r3.zzg(r4, r0)
            return
    }

    public final boolean zzf(com.google.android.gms.internal.ads.zzbdk r2) {
            r1 = this;
            java.util.concurrent.BlockingQueue r0 = r1.zza
            boolean r2 = r0.offer(r2)
            return r2
    }
}
