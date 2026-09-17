package com.google.android.gms.ads.internal.util.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzl {
    public static final /* synthetic */ int zza = 0;
    private static final java.lang.Object zzb = null;
    private static boolean zzc;
    private static boolean zzd;
    private static final com.google.android.gms.common.util.Clock zze = null;
    private static final java.util.Set zzf = null;
    private final java.util.List zzg;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.ads.internal.util.client.zzl.zzb = r0
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.common.util.DefaultClock.getInstance()
            com.google.android.gms.ads.internal.util.client.zzl.zze = r0
            java.util.HashSet r0 = new java.util.HashSet
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            com.google.android.gms.ads.internal.util.client.zzl.zzf = r0
            return
    }

    public zzl() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public zzl(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            boolean r3 = zzk()
            if (r3 != 0) goto Lf
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            goto L2b
        Lf:
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "network_request_"
            java.lang.String r3 = r0.concat(r3)
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            r0[r1] = r3
            java.util.List r3 = java.util.Arrays.asList(r0)
        L2b:
            r2.zzg = r3
            return
    }

    static /* synthetic */ void zza(java.lang.String r1, java.lang.String r2, java.util.Map r3, byte[] r4, android.util.JsonWriter r5) throws java.io.IOException {
            java.lang.String r0 = "params"
            android.util.JsonWriter r0 = r5.name(r0)
            r0.beginObject()
            java.lang.String r0 = "firstline"
            android.util.JsonWriter r0 = r5.name(r0)
            r0.beginObject()
            java.lang.String r0 = "uri"
            android.util.JsonWriter r0 = r5.name(r0)
            r0.value(r1)
            java.lang.String r1 = "verb"
            android.util.JsonWriter r1 = r5.name(r1)
            r1.value(r2)
            r5.endObject()
            zzr(r5, r3)
            if (r4 == 0) goto L39
            java.lang.String r1 = "body"
            android.util.JsonWriter r1 = r5.name(r1)
            java.lang.String r2 = com.google.android.gms.common.util.Base64Utils.encode(r4)
            r1.value(r2)
        L39:
            r5.endObject()
            return
    }

    static /* synthetic */ void zzb(int r3, java.util.Map r4, android.util.JsonWriter r5) throws java.io.IOException {
            java.lang.String r0 = "params"
            android.util.JsonWriter r0 = r5.name(r0)
            r0.beginObject()
            java.lang.String r0 = "firstline"
            android.util.JsonWriter r0 = r5.name(r0)
            r0.beginObject()
            java.lang.String r0 = "code"
            android.util.JsonWriter r0 = r5.name(r0)
            long r1 = (long) r3
            r0.value(r1)
            r5.endObject()
            zzr(r5, r4)
            r5.endObject()
            return
    }

    public static void zzi() {
            java.lang.Object r0 = com.google.android.gms.ads.internal.util.client.zzl.zzb
            monitor-enter(r0)
            r1 = 0
            com.google.android.gms.ads.internal.util.client.zzl.zzc = r1     // Catch: java.lang.Throwable -> Lf
            com.google.android.gms.ads.internal.util.client.zzl.zzd = r1     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = "Ad debug logging enablement is out of date."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    public static void zzj(boolean r2) {
            java.lang.Object r0 = com.google.android.gms.ads.internal.util.client.zzl.zzb
            monitor-enter(r0)
            r1 = 1
            com.google.android.gms.ads.internal.util.client.zzl.zzc = r1     // Catch: java.lang.Throwable -> La
            com.google.android.gms.ads.internal.util.client.zzl.zzd = r2     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r2
    }

    public static boolean zzk() {
            java.lang.Object r0 = com.google.android.gms.ads.internal.util.client.zzl.zzb
            monitor-enter(r0)
            boolean r1 = com.google.android.gms.ads.internal.util.client.zzl.zzc     // Catch: java.lang.Throwable -> Lf
            r2 = 0
            if (r1 == 0) goto Ld
            boolean r1 = com.google.android.gms.ads.internal.util.client.zzl.zzd     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto Ld
            r2 = 1
        Ld:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r2
        Lf:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    public static boolean zzl() {
            java.lang.Object r0 = com.google.android.gms.ads.internal.util.client.zzl.zzb
            monitor-enter(r0)
            boolean r1 = com.google.android.gms.ads.internal.util.client.zzl.zzc     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    private static synchronized void zzm(java.lang.String r4) {
            java.lang.Class<com.google.android.gms.ads.internal.util.client.zzl> r0 = com.google.android.gms.ads.internal.util.client.zzl.class
            monitor-enter(r0)
            java.lang.String r1 = "GMA Debug BEGIN"
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r1)     // Catch: java.lang.Throwable -> L33
            r1 = 0
        L9:
            int r2 = r4.length()     // Catch: java.lang.Throwable -> L33
            if (r1 >= r2) goto L2c
            int r2 = r1 + 4000
            int r3 = r4.length()     // Catch: java.lang.Throwable -> L33
            int r3 = java.lang.Math.min(r2, r3)     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = r4.substring(r1, r3)     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L33
            java.lang.String r3 = "GMA Debug CONTENT "
            java.lang.String r1 = r3.concat(r1)     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r1)     // Catch: java.lang.Throwable -> L33
            r1 = r2
            goto L9
        L2c:
            java.lang.String r4 = "GMA Debug FINISH"
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r4)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r0)
            return
        L33:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    private final void zzn(java.lang.String r6, com.google.android.gms.ads.internal.util.client.zzk r7) {
            r5 = this;
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            android.util.JsonWriter r1 = new android.util.JsonWriter
            r1.<init>(r0)
            r1.beginObject()     // Catch: java.io.IOException -> L54
            java.lang.String r2 = "timestamp"
            android.util.JsonWriter r2 = r1.name(r2)     // Catch: java.io.IOException -> L54
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.util.client.zzl.zze     // Catch: java.io.IOException -> L54
            long r3 = r3.currentTimeMillis()     // Catch: java.io.IOException -> L54
            r2.value(r3)     // Catch: java.io.IOException -> L54
            java.lang.String r2 = "event"
            android.util.JsonWriter r2 = r1.name(r2)     // Catch: java.io.IOException -> L54
            r2.value(r6)     // Catch: java.io.IOException -> L54
            java.lang.String r6 = "components"
            android.util.JsonWriter r6 = r1.name(r6)     // Catch: java.io.IOException -> L54
            r6.beginArray()     // Catch: java.io.IOException -> L54
            java.util.List r6 = r5.zzg     // Catch: java.io.IOException -> L54
            java.util.Iterator r6 = r6.iterator()     // Catch: java.io.IOException -> L54
        L34:
            boolean r2 = r6.hasNext()     // Catch: java.io.IOException -> L54
            if (r2 == 0) goto L44
            java.lang.Object r2 = r6.next()     // Catch: java.io.IOException -> L54
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.io.IOException -> L54
            r1.value(r2)     // Catch: java.io.IOException -> L54
            goto L34
        L44:
            r1.endArray()     // Catch: java.io.IOException -> L54
            r7.zza(r1)     // Catch: java.io.IOException -> L54
            r1.endObject()     // Catch: java.io.IOException -> L54
            r1.flush()     // Catch: java.io.IOException -> L54
            r1.close()     // Catch: java.io.IOException -> L54
            goto L5a
        L54:
            r6 = move-exception
            java.lang.String r7 = "unable to log"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r7, r6)
        L5a:
            java.lang.String r6 = r0.toString()
            zzm(r6)
            return
    }

    private final void zzo(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.ads.internal.util.client.zzi r0 = new com.google.android.gms.ads.internal.util.client.zzi
            r0.<init>(r2)
            java.lang.String r2 = "onNetworkRequestError"
            r1.zzn(r2, r0)
            return
    }

    private final void zzp(java.lang.String r2, java.lang.String r3, java.util.Map r4, byte[] r5) {
            r1 = this;
            com.google.android.gms.ads.internal.util.client.zzg r0 = new com.google.android.gms.ads.internal.util.client.zzg
            r0.<init>(r2, r3, r4, r5)
            java.lang.String r2 = "onNetworkRequest"
            r1.zzn(r2, r0)
            return
    }

    private final void zzq(java.util.Map r2, int r3) {
            r1 = this;
            com.google.android.gms.ads.internal.util.client.zzj r0 = new com.google.android.gms.ads.internal.util.client.zzj
            r0.<init>(r3, r2)
            java.lang.String r2 = "onNetworkResponse"
            r1.zzn(r2, r0)
            return
    }

    private static void zzr(android.util.JsonWriter r6, java.util.Map r7) throws java.io.IOException {
            if (r7 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "headers"
            android.util.JsonWriter r0 = r6.name(r0)
            r0.beginArray()
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L14:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L8d
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Set r2 = com.google.android.gms.ads.internal.util.client.zzl.zzf
            boolean r2 = r2.contains(r1)
            if (r2 != 0) goto L14
            java.lang.Object r2 = r0.getValue()
            boolean r2 = r2 instanceof java.util.List
            java.lang.String r3 = "value"
            java.lang.String r4 = "name"
            if (r2 == 0) goto L65
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        L44:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L14
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            r6.beginObject()
            android.util.JsonWriter r5 = r6.name(r4)
            r5.value(r1)
            android.util.JsonWriter r5 = r6.name(r3)
            r5.value(r2)
            r6.endObject()
            goto L44
        L65:
            java.lang.Object r2 = r0.getValue()
            boolean r2 = r2 instanceof java.lang.String
            if (r2 == 0) goto L88
            r6.beginObject()
            android.util.JsonWriter r2 = r6.name(r4)
            r2.value(r1)
            android.util.JsonWriter r1 = r6.name(r3)
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r1.value(r0)
            r6.endObject()
            goto L14
        L88:
            java.lang.String r7 = "Connection headers should be either Map<String, String> or Map<String, List<String>>"
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r7)
        L8d:
            r6.endArray()
            return
    }

    public final void zzc(java.net.HttpURLConnection r4, byte[] r5) {
            r3 = this;
            boolean r0 = zzk()
            if (r0 != 0) goto L7
            return
        L7:
            java.util.Map r0 = r4.getRequestProperties()
            if (r0 != 0) goto Lf
            r0 = 0
            goto L18
        Lf:
            java.util.HashMap r0 = new java.util.HashMap
            java.util.Map r1 = r4.getRequestProperties()
            r0.<init>(r1)
        L18:
            java.lang.String r1 = new java.lang.String
            java.net.URL r2 = r4.getURL()
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            java.lang.String r2 = new java.lang.String
            java.lang.String r4 = r4.getRequestMethod()
            r2.<init>(r4)
            r3.zzp(r1, r2, r0, r5)
            return
    }

    public final void zzd(java.lang.String r1, java.lang.String r2, java.util.Map r3, byte[] r4) {
            r0 = this;
            boolean r2 = zzk()
            if (r2 != 0) goto L7
            return
        L7:
            java.lang.String r2 = "GET"
            r0.zzp(r1, r2, r3, r4)
            return
    }

    public final void zze(java.net.HttpURLConnection r4, int r5) {
            r3 = this;
            boolean r0 = zzk()
            if (r0 != 0) goto L7
            goto L25
        L7:
            java.util.Map r0 = r4.getHeaderFields()
            r1 = 0
            if (r0 != 0) goto L10
            r0 = r1
            goto L19
        L10:
            java.util.HashMap r0 = new java.util.HashMap
            java.util.Map r2 = r4.getHeaderFields()
            r0.<init>(r2)
        L19:
            r3.zzq(r0, r5)
            r0 = 200(0xc8, float:2.8E-43)
            if (r5 < r0) goto L26
            r0 = 300(0x12c, float:4.2E-43)
            if (r5 < r0) goto L25
            goto L26
        L25:
            return
        L26:
            java.lang.String r1 = r4.getResponseMessage()     // Catch: java.io.IOException -> L2b
            goto L3d
        L2b:
            r4 = move-exception
            java.lang.String r4 = r4.getMessage()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = "Can not get error message from error HttpURLConnection\n"
            java.lang.String r4 = r5.concat(r4)
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r4)
        L3d:
            r3.zzo(r1)
            return
    }

    public final void zzf(java.util.Map r2, int r3) {
            r1 = this;
            boolean r0 = zzk()
            if (r0 != 0) goto L7
            goto L13
        L7:
            r1.zzq(r2, r3)
            r2 = 200(0xc8, float:2.8E-43)
            if (r3 < r2) goto L14
            r2 = 300(0x12c, float:4.2E-43)
            if (r3 < r2) goto L13
            goto L14
        L13:
            return
        L14:
            r2 = 0
            r1.zzo(r2)
            return
    }

    public final void zzg(java.lang.String r2) {
            r1 = this;
            boolean r0 = zzk()
            if (r0 != 0) goto L7
            goto L10
        L7:
            if (r2 == 0) goto L10
            byte[] r2 = r2.getBytes()
            r1.zzh(r2)
        L10:
            return
    }

    public final void zzh(byte[] r2) {
            r1 = this;
            com.google.android.gms.ads.internal.util.client.zzh r0 = new com.google.android.gms.ads.internal.util.client.zzh
            r0.<init>(r2)
            java.lang.String r2 = "onNetworkResponseBody"
            r1.zzn(r2, r0)
            return
    }
}
