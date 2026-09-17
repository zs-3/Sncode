package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes.dex */
final class zzu {
    private final android.app.Application zza;
    private final android.os.Handler zzb;
    private final java.util.concurrent.Executor zzc;
    private final com.google.android.gms.internal.consent_sdk.zzap zzd;
    private final com.google.android.gms.internal.consent_sdk.zzbn zze;
    private final com.google.android.gms.internal.consent_sdk.zzl zzf;
    private final com.google.android.gms.internal.consent_sdk.zzx zzg;
    private final com.google.android.gms.internal.consent_sdk.zze zzh;

    zzu(android.app.Application r1, com.google.android.gms.internal.consent_sdk.zzab r2, android.os.Handler r3, java.util.concurrent.Executor r4, com.google.android.gms.internal.consent_sdk.zzap r5, com.google.android.gms.internal.consent_sdk.zzbn r6, com.google.android.gms.internal.consent_sdk.zzl r7, com.google.android.gms.internal.consent_sdk.zzx r8, com.google.android.gms.internal.consent_sdk.zze r9) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r5
            r0.zze = r6
            r0.zzf = r7
            r0.zzg = r8
            r0.zzh = r9
            return
    }

    private final com.google.android.gms.internal.consent_sdk.zzck zzd(com.google.android.gms.internal.consent_sdk.zzci r12) throws com.google.android.gms.internal.consent_sdk.zzg {
            r11 = this;
            java.lang.String r0 = "UTF-8"
            r1 = 2
            r2 = 4
            java.net.URL r3 = new java.net.URL     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            java.lang.String r4 = "https://fundingchoicesmessages.google.com/a/consent"
            r3.<init>(r4)     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            java.net.URLConnection r3 = r3.openConnection()     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            java.lang.String r4 = "User-Agent"
            android.app.Application r5 = r11.zza     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            java.lang.String r5 = android.webkit.WebSettings.getDefaultUserAgent(r5)     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            r3.setRequestProperty(r4, r5)     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            r4 = 10000(0x2710, float:1.4013E-41)
            r3.setConnectTimeout(r4)     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            r4 = 30000(0x7530, float:4.2039E-41)
            r3.setReadTimeout(r4)     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            r4 = 1
            r3.setDoOutput(r4)     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            java.lang.String r5 = "POST"
            r3.setRequestMethod(r5)     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            java.lang.String r5 = "Content-Type"
            java.lang.String r6 = "application/json"
            r3.setRequestProperty(r5, r6)     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            java.io.OutputStreamWriter r5 = new java.io.OutputStreamWriter     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            java.io.OutputStream r6 = r3.getOutputStream()     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            r5.<init>(r6, r0)     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            android.util.JsonWriter r6 = new android.util.JsonWriter     // Catch: java.lang.Throwable -> L2c2
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L2c2
            r6.beginObject()     // Catch: java.lang.Throwable -> L2b8
            java.lang.String r7 = r12.zza     // Catch: java.lang.Throwable -> L2b8
            if (r7 == 0) goto L53
            java.lang.String r8 = "admob_app_id"
            r6.name(r8)     // Catch: java.lang.Throwable -> L2b8
            r6.value(r7)     // Catch: java.lang.Throwable -> L2b8
        L53:
            com.google.android.gms.internal.consent_sdk.zzce r7 = r12.zzb     // Catch: java.lang.Throwable -> L2b8
            if (r7 == 0) goto L95
            java.lang.String r8 = "device_info"
            r6.name(r8)     // Catch: java.lang.Throwable -> L2b8
            r6.beginObject()     // Catch: java.lang.Throwable -> L2b8
            int r8 = r7.zzc     // Catch: java.lang.Throwable -> L2b8
            if (r8 == r4) goto L7a
            java.lang.String r9 = "os_type"
            r6.name(r9)     // Catch: java.lang.Throwable -> L2b8
            int r8 = r8 + (-1)
            if (r8 == 0) goto L75
            if (r8 == r4) goto L6f
            goto L7a
        L6f:
            java.lang.String r8 = "ANDROID"
            r6.value(r8)     // Catch: java.lang.Throwable -> L2b8
            goto L7a
        L75:
            java.lang.String r8 = "UNKNOWN"
            r6.value(r8)     // Catch: java.lang.Throwable -> L2b8
        L7a:
            java.lang.String r8 = r7.zza     // Catch: java.lang.Throwable -> L2b8
            if (r8 == 0) goto L86
            java.lang.String r9 = "model"
            r6.name(r9)     // Catch: java.lang.Throwable -> L2b8
            r6.value(r8)     // Catch: java.lang.Throwable -> L2b8
        L86:
            java.lang.Integer r7 = r7.zzb     // Catch: java.lang.Throwable -> L2b8
            if (r7 == 0) goto L92
            java.lang.String r8 = "android_api_level"
            r6.name(r8)     // Catch: java.lang.Throwable -> L2b8
            r6.value(r7)     // Catch: java.lang.Throwable -> L2b8
        L92:
            r6.endObject()     // Catch: java.lang.Throwable -> L2b8
        L95:
            java.lang.String r7 = r12.zzc     // Catch: java.lang.Throwable -> L2b8
            if (r7 == 0) goto La1
            java.lang.String r8 = "language_code"
            r6.name(r8)     // Catch: java.lang.Throwable -> L2b8
            r6.value(r7)     // Catch: java.lang.Throwable -> L2b8
        La1:
            java.lang.Boolean r7 = r12.zzd     // Catch: java.lang.Throwable -> L2b8
            if (r7 == 0) goto Lb1
            java.lang.String r8 = "tag_for_under_age_of_consent"
            r6.name(r8)     // Catch: java.lang.Throwable -> L2b8
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L2b8
            r6.value(r7)     // Catch: java.lang.Throwable -> L2b8
        Lb1:
            java.util.Map r7 = r12.zze     // Catch: java.lang.Throwable -> L2b8
            boolean r8 = r7.isEmpty()     // Catch: java.lang.Throwable -> L2b8
            if (r8 != 0) goto Leb
            java.lang.String r8 = "stored_infos_map"
            r6.name(r8)     // Catch: java.lang.Throwable -> L2b8
            r6.beginObject()     // Catch: java.lang.Throwable -> L2b8
            java.util.Set r7 = r7.entrySet()     // Catch: java.lang.Throwable -> L2b8
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L2b8
        Lc9:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> L2b8
            if (r8 == 0) goto Le8
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L2b8
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch: java.lang.Throwable -> L2b8
            java.lang.Object r9 = r8.getKey()     // Catch: java.lang.Throwable -> L2b8
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L2b8
            r6.name(r9)     // Catch: java.lang.Throwable -> L2b8
            java.lang.Object r8 = r8.getValue()     // Catch: java.lang.Throwable -> L2b8
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L2b8
            r6.value(r8)     // Catch: java.lang.Throwable -> L2b8
            goto Lc9
        Le8:
            r6.endObject()     // Catch: java.lang.Throwable -> L2b8
        Leb:
            com.google.android.gms.internal.consent_sdk.zzcg r7 = r12.zzf     // Catch: java.lang.Throwable -> L2b8
            if (r7 == 0) goto L178
            java.lang.String r8 = "screen_info"
            r6.name(r8)     // Catch: java.lang.Throwable -> L2b8
            r6.beginObject()     // Catch: java.lang.Throwable -> L2b8
            java.lang.Integer r8 = r7.zza     // Catch: java.lang.Throwable -> L2b8
            if (r8 == 0) goto L103
            java.lang.String r9 = "width"
            r6.name(r9)     // Catch: java.lang.Throwable -> L2b8
            r6.value(r8)     // Catch: java.lang.Throwable -> L2b8
        L103:
            java.lang.Integer r8 = r7.zzb     // Catch: java.lang.Throwable -> L2b8
            if (r8 == 0) goto L10f
            java.lang.String r9 = "height"
            r6.name(r9)     // Catch: java.lang.Throwable -> L2b8
            r6.value(r8)     // Catch: java.lang.Throwable -> L2b8
        L10f:
            java.lang.Double r8 = r7.zzc     // Catch: java.lang.Throwable -> L2b8
            if (r8 == 0) goto L11b
            java.lang.String r9 = "density"
            r6.name(r9)     // Catch: java.lang.Throwable -> L2b8
            r6.value(r8)     // Catch: java.lang.Throwable -> L2b8
        L11b:
            java.util.List r7 = r7.zzd     // Catch: java.lang.Throwable -> L2b8
            boolean r8 = r7.isEmpty()     // Catch: java.lang.Throwable -> L2b8
            if (r8 != 0) goto L175
            java.lang.String r8 = "screen_insets"
            r6.name(r8)     // Catch: java.lang.Throwable -> L2b8
            r6.beginArray()     // Catch: java.lang.Throwable -> L2b8
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L2b8
        L12f:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> L2b8
            if (r8 == 0) goto L172
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L2b8
            com.google.android.gms.internal.consent_sdk.zzcf r8 = (com.google.android.gms.internal.consent_sdk.zzcf) r8     // Catch: java.lang.Throwable -> L2b8
            r6.beginObject()     // Catch: java.lang.Throwable -> L2b8
            java.lang.Integer r9 = r8.zza     // Catch: java.lang.Throwable -> L2b8
            if (r9 == 0) goto L14a
            java.lang.String r10 = "top"
            r6.name(r10)     // Catch: java.lang.Throwable -> L2b8
            r6.value(r9)     // Catch: java.lang.Throwable -> L2b8
        L14a:
            java.lang.Integer r9 = r8.zzb     // Catch: java.lang.Throwable -> L2b8
            if (r9 == 0) goto L156
            java.lang.String r10 = "left"
            r6.name(r10)     // Catch: java.lang.Throwable -> L2b8
            r6.value(r9)     // Catch: java.lang.Throwable -> L2b8
        L156:
            java.lang.Integer r9 = r8.zzc     // Catch: java.lang.Throwable -> L2b8
            if (r9 == 0) goto L162
            java.lang.String r10 = "right"
            r6.name(r10)     // Catch: java.lang.Throwable -> L2b8
            r6.value(r9)     // Catch: java.lang.Throwable -> L2b8
        L162:
            java.lang.Integer r8 = r8.zzd     // Catch: java.lang.Throwable -> L2b8
            if (r8 == 0) goto L16e
            java.lang.String r9 = "bottom"
            r6.name(r9)     // Catch: java.lang.Throwable -> L2b8
            r6.value(r8)     // Catch: java.lang.Throwable -> L2b8
        L16e:
            r6.endObject()     // Catch: java.lang.Throwable -> L2b8
            goto L12f
        L172:
            r6.endArray()     // Catch: java.lang.Throwable -> L2b8
        L175:
            r6.endObject()     // Catch: java.lang.Throwable -> L2b8
        L178:
            com.google.android.gms.internal.consent_sdk.zzcc r7 = r12.zzg     // Catch: java.lang.Throwable -> L2b8
            java.lang.String r8 = "version"
            if (r7 == 0) goto L1ab
            java.lang.String r9 = "app_info"
            r6.name(r9)     // Catch: java.lang.Throwable -> L2b8
            r6.beginObject()     // Catch: java.lang.Throwable -> L2b8
            java.lang.String r9 = r7.zza     // Catch: java.lang.Throwable -> L2b8
            if (r9 == 0) goto L192
            java.lang.String r10 = "package_name"
            r6.name(r10)     // Catch: java.lang.Throwable -> L2b8
            r6.value(r9)     // Catch: java.lang.Throwable -> L2b8
        L192:
            java.lang.String r9 = r7.zzb     // Catch: java.lang.Throwable -> L2b8
            if (r9 == 0) goto L19e
            java.lang.String r10 = "publisher_display_name"
            r6.name(r10)     // Catch: java.lang.Throwable -> L2b8
            r6.value(r9)     // Catch: java.lang.Throwable -> L2b8
        L19e:
            java.lang.String r7 = r7.zzc     // Catch: java.lang.Throwable -> L2b8
            if (r7 == 0) goto L1a8
            r6.name(r8)     // Catch: java.lang.Throwable -> L2b8
            r6.value(r7)     // Catch: java.lang.Throwable -> L2b8
        L1a8:
            r6.endObject()     // Catch: java.lang.Throwable -> L2b8
        L1ab:
            com.google.android.gms.internal.consent_sdk.zzch r7 = r12.zzh     // Catch: java.lang.Throwable -> L2b8
            if (r7 == 0) goto L1c4
            java.lang.String r9 = "sdk_info"
            r6.name(r9)     // Catch: java.lang.Throwable -> L2b8
            r6.beginObject()     // Catch: java.lang.Throwable -> L2b8
            java.lang.String r7 = r7.zza     // Catch: java.lang.Throwable -> L2b8
            if (r7 == 0) goto L1c1
            r6.name(r8)     // Catch: java.lang.Throwable -> L2b8
            r6.value(r7)     // Catch: java.lang.Throwable -> L2b8
        L1c1:
            r6.endObject()     // Catch: java.lang.Throwable -> L2b8
        L1c4:
            java.util.List r12 = r12.zzi     // Catch: java.lang.Throwable -> L2b8
            boolean r7 = r12.isEmpty()     // Catch: java.lang.Throwable -> L2b8
            if (r7 != 0) goto L215
            java.lang.String r7 = "debug_params"
            r6.name(r7)     // Catch: java.lang.Throwable -> L2b8
            r6.beginArray()     // Catch: java.lang.Throwable -> L2b8
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> L2b8
        L1d8:
            boolean r7 = r12.hasNext()     // Catch: java.lang.Throwable -> L2b8
            if (r7 == 0) goto L212
            java.lang.Object r7 = r12.next()     // Catch: java.lang.Throwable -> L2b8
            com.google.android.gms.internal.consent_sdk.zzcd r7 = (com.google.android.gms.internal.consent_sdk.zzcd) r7     // Catch: java.lang.Throwable -> L2b8
            int r7 = r7.ordinal()     // Catch: java.lang.Throwable -> L2b8
            if (r7 == 0) goto L20c
            if (r7 == r4) goto L206
            if (r7 == r1) goto L200
            r8 = 3
            if (r7 == r8) goto L1fa
            if (r7 == r2) goto L1f4
            goto L1d8
        L1f4:
            java.lang.String r7 = "PREVIEWING_DEBUG_MESSAGES"
            r6.value(r7)     // Catch: java.lang.Throwable -> L2b8
            goto L1d8
        L1fa:
            java.lang.String r7 = "GEO_OVERRIDE_NON_EEA"
            r6.value(r7)     // Catch: java.lang.Throwable -> L2b8
            goto L1d8
        L200:
            java.lang.String r7 = "GEO_OVERRIDE_EEA"
            r6.value(r7)     // Catch: java.lang.Throwable -> L2b8
            goto L1d8
        L206:
            java.lang.String r7 = "ALWAYS_SHOW"
            r6.value(r7)     // Catch: java.lang.Throwable -> L2b8
            goto L1d8
        L20c:
            java.lang.String r7 = "DEBUG_PARAM_UNKNOWN"
            r6.value(r7)     // Catch: java.lang.Throwable -> L2b8
            goto L1d8
        L212:
            r6.endArray()     // Catch: java.lang.Throwable -> L2b8
        L215:
            r6.endObject()     // Catch: java.lang.Throwable -> L2b8
            r6.close()     // Catch: java.lang.Throwable -> L2c2
            r5.close()     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            int r12 = r3.getResponseCode()     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            r4 = 200(0xc8, float:2.8E-43)
            java.lang.String r5 = "\\A"
            if (r12 != r4) goto L288
            java.lang.String r12 = "x-ump-using-header"
            java.lang.String r12 = r3.getHeaderField(r12)     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            if (r12 == 0) goto L252
            android.util.JsonReader r0 = new android.util.JsonReader     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            java.io.StringReader r4 = new java.io.StringReader     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            r4.<init>(r12)     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            r0.<init>(r4)     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            com.google.android.gms.internal.consent_sdk.zzck r12 = com.google.android.gms.internal.consent_sdk.zzck.zza(r0)     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            java.util.Scanner r0 = new java.util.Scanner     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            java.io.InputStream r3 = r3.getInputStream()     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            r0.<init>(r3)     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            java.util.Scanner r0 = r0.useDelimiter(r5)     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            java.lang.String r0 = r0.next()     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            r12.zza = r0     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            goto L273
        L252:
            java.io.BufferedReader r12 = new java.io.BufferedReader     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            java.io.InputStream r3 = r3.getInputStream()     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            r4.<init>(r3, r0)     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            r12.<init>(r4)     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            r12.readLine()     // Catch: java.lang.Throwable -> L27e
            android.util.JsonReader r0 = new android.util.JsonReader     // Catch: java.lang.Throwable -> L27e
            r0.<init>(r12)     // Catch: java.lang.Throwable -> L27e
            com.google.android.gms.internal.consent_sdk.zzck r3 = com.google.android.gms.internal.consent_sdk.zzck.zza(r0)     // Catch: java.lang.Throwable -> L274
            r0.close()     // Catch: java.lang.Throwable -> L27e
            r12.close()     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            r12 = r3
        L273:
            return r12
        L274:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L279
            goto L27d
        L279:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch: java.lang.Throwable -> L27e
        L27d:
            throw r3     // Catch: java.lang.Throwable -> L27e
        L27e:
            r0 = move-exception
            r12.close()     // Catch: java.lang.Throwable -> L283
            goto L287
        L283:
            r12 = move-exception
            r0.addSuppressed(r12)     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
        L287:
            throw r0     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
        L288:
            java.util.Scanner r0 = new java.util.Scanner     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            java.io.InputStream r3 = r3.getErrorStream()     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            r0.<init>(r3)     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            java.util.Scanner r0 = r0.useDelimiter(r5)     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            java.lang.String r0 = r0.next()     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            java.io.IOException r3 = new java.io.IOException     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            r4.<init>()     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            java.lang.String r5 = "Http error code - "
            r4.append(r5)     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            r4.append(r12)     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            java.lang.String r12 = ".\n"
            r4.append(r12)     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            r4.append(r0)     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            java.lang.String r12 = r4.toString()     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            r3.<init>(r12)     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
            throw r3     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
        L2b8:
            r12 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> L2bd
            goto L2c1
        L2bd:
            r0 = move-exception
            r12.addSuppressed(r0)     // Catch: java.lang.Throwable -> L2c2
        L2c1:
            throw r12     // Catch: java.lang.Throwable -> L2c2
        L2c2:
            r12 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> L2c7
            goto L2cb
        L2c7:
            r0 = move-exception
            r12.addSuppressed(r0)     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
        L2cb:
            throw r12     // Catch: java.io.IOException -> L2cc java.net.SocketTimeoutException -> L2d5
        L2cc:
            r12 = move-exception
            com.google.android.gms.internal.consent_sdk.zzg r0 = new com.google.android.gms.internal.consent_sdk.zzg
            java.lang.String r2 = "Error making request."
            r0.<init>(r1, r2, r12)
            throw r0
        L2d5:
            r12 = move-exception
            com.google.android.gms.internal.consent_sdk.zzg r0 = new com.google.android.gms.internal.consent_sdk.zzg
            java.lang.String r1 = "The server timed out."
            r0.<init>(r2, r1, r12)
            throw r0
    }

    final /* synthetic */ void zza(com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener r2, com.google.android.gms.internal.consent_sdk.zzz r3) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            com.google.android.gms.internal.consent_sdk.zzt r0 = new com.google.android.gms.internal.consent_sdk.zzt
            r0.<init>(r2)
            android.os.Handler r2 = r1.zzb
            r2.post(r0)
            com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus r2 = r3.zzb
            com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus r3 = com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED
            if (r2 == r3) goto L18
            com.google.android.gms.internal.consent_sdk.zzbn r2 = r1.zze
            r2.zzc()
        L18:
            return
    }

    final /* synthetic */ void zzb(android.app.Activity r4, com.google.android.ump.ConsentRequestParameters r5, com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener r6, com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener r7) {
            r3 = this;
            com.google.android.ump.ConsentDebugSettings r0 = r5.getConsentDebugSettings()     // Catch: java.lang.RuntimeException -> L66 com.google.android.gms.internal.consent_sdk.zzg -> L86
            if (r0 == 0) goto Lc
            boolean r0 = r0.isTestDevice()     // Catch: java.lang.RuntimeException -> L66 com.google.android.gms.internal.consent_sdk.zzg -> L86
            if (r0 != 0) goto L2d
        Lc:
            android.app.Application r0 = r3.zza     // Catch: java.lang.RuntimeException -> L66 com.google.android.gms.internal.consent_sdk.zzg -> L86
            java.lang.String r0 = com.google.android.gms.internal.consent_sdk.zzcl.zza(r0)     // Catch: java.lang.RuntimeException -> L66 com.google.android.gms.internal.consent_sdk.zzg -> L86
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L66 com.google.android.gms.internal.consent_sdk.zzg -> L86
            r1.<init>()     // Catch: java.lang.RuntimeException -> L66 com.google.android.gms.internal.consent_sdk.zzg -> L86
            java.lang.String r2 = "Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\""
            r1.append(r2)     // Catch: java.lang.RuntimeException -> L66 com.google.android.gms.internal.consent_sdk.zzg -> L86
            r1.append(r0)     // Catch: java.lang.RuntimeException -> L66 com.google.android.gms.internal.consent_sdk.zzg -> L86
            java.lang.String r0 = "\") to set this as a debug device."
            r1.append(r0)     // Catch: java.lang.RuntimeException -> L66 com.google.android.gms.internal.consent_sdk.zzg -> L86
            java.lang.String r0 = r1.toString()     // Catch: java.lang.RuntimeException -> L66 com.google.android.gms.internal.consent_sdk.zzg -> L86
            java.lang.String r1 = "UserMessagingPlatform"
            android.util.Log.i(r1, r0)     // Catch: java.lang.RuntimeException -> L66 com.google.android.gms.internal.consent_sdk.zzg -> L86
        L2d:
            com.google.android.gms.internal.consent_sdk.zzl r0 = r3.zzf     // Catch: java.lang.RuntimeException -> L66 com.google.android.gms.internal.consent_sdk.zzg -> L86
            com.google.android.gms.internal.consent_sdk.zzci r4 = r0.zzc(r4, r5)     // Catch: java.lang.RuntimeException -> L66 com.google.android.gms.internal.consent_sdk.zzg -> L86
            com.google.android.gms.internal.consent_sdk.zzck r4 = r3.zzd(r4)     // Catch: java.lang.RuntimeException -> L66 com.google.android.gms.internal.consent_sdk.zzg -> L86
            com.google.android.gms.internal.consent_sdk.zzx r5 = r3.zzg     // Catch: java.lang.RuntimeException -> L66 com.google.android.gms.internal.consent_sdk.zzg -> L86
            com.google.android.gms.internal.consent_sdk.zzw r0 = new com.google.android.gms.internal.consent_sdk.zzw     // Catch: java.lang.RuntimeException -> L66 com.google.android.gms.internal.consent_sdk.zzg -> L86
            r0.<init>(r5, r4)     // Catch: java.lang.RuntimeException -> L66 com.google.android.gms.internal.consent_sdk.zzg -> L86
            com.google.android.gms.internal.consent_sdk.zzz r4 = r0.zza()     // Catch: java.lang.RuntimeException -> L66 com.google.android.gms.internal.consent_sdk.zzg -> L86
            com.google.android.gms.internal.consent_sdk.zzap r5 = r3.zzd     // Catch: java.lang.RuntimeException -> L66 com.google.android.gms.internal.consent_sdk.zzg -> L86
            int r0 = r4.zza     // Catch: java.lang.RuntimeException -> L66 com.google.android.gms.internal.consent_sdk.zzg -> L86
            r5.zzg(r0)     // Catch: java.lang.RuntimeException -> L66 com.google.android.gms.internal.consent_sdk.zzg -> L86
            com.google.android.gms.internal.consent_sdk.zzap r5 = r3.zzd     // Catch: java.lang.RuntimeException -> L66 com.google.android.gms.internal.consent_sdk.zzg -> L86
            com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus r0 = r4.zzb     // Catch: java.lang.RuntimeException -> L66 com.google.android.gms.internal.consent_sdk.zzg -> L86
            r5.zzi(r0)     // Catch: java.lang.RuntimeException -> L66 com.google.android.gms.internal.consent_sdk.zzg -> L86
            com.google.android.gms.internal.consent_sdk.zzbn r5 = r3.zze     // Catch: java.lang.RuntimeException -> L66 com.google.android.gms.internal.consent_sdk.zzg -> L86
            com.google.android.gms.internal.consent_sdk.zzbp r0 = r4.zzc     // Catch: java.lang.RuntimeException -> L66 com.google.android.gms.internal.consent_sdk.zzg -> L86
            r5.zzd(r0)     // Catch: java.lang.RuntimeException -> L66 com.google.android.gms.internal.consent_sdk.zzg -> L86
            com.google.android.gms.internal.consent_sdk.zze r5 = r3.zzh     // Catch: java.lang.RuntimeException -> L66 com.google.android.gms.internal.consent_sdk.zzg -> L86
            java.util.concurrent.Executor r5 = r5.zza()     // Catch: java.lang.RuntimeException -> L66 com.google.android.gms.internal.consent_sdk.zzg -> L86
            com.google.android.gms.internal.consent_sdk.zzp r0 = new com.google.android.gms.internal.consent_sdk.zzp     // Catch: java.lang.RuntimeException -> L66 com.google.android.gms.internal.consent_sdk.zzg -> L86
            r0.<init>(r3, r6, r4)     // Catch: java.lang.RuntimeException -> L66 com.google.android.gms.internal.consent_sdk.zzg -> L86
            r5.execute(r0)     // Catch: java.lang.RuntimeException -> L66 com.google.android.gms.internal.consent_sdk.zzg -> L86
            return
        L66:
            r4 = move-exception
            com.google.android.gms.internal.consent_sdk.zzg r5 = new com.google.android.gms.internal.consent_sdk.zzg
            java.lang.String r4 = android.util.Log.getStackTraceString(r4)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r6 = 1
            java.lang.String r0 = "Caught exception when trying to request consent info update: "
            java.lang.String r4 = r0.concat(r4)
            r5.<init>(r6, r4)
            android.os.Handler r4 = r3.zzb
            com.google.android.gms.internal.consent_sdk.zzs r6 = new com.google.android.gms.internal.consent_sdk.zzs
            r6.<init>(r7, r5)
            r4.post(r6)
            return
        L86:
            r4 = move-exception
            android.os.Handler r5 = r3.zzb
            com.google.android.gms.internal.consent_sdk.zzr r6 = new com.google.android.gms.internal.consent_sdk.zzr
            r6.<init>(r7, r4)
            r5.post(r6)
            return
    }

    final void zzc(android.app.Activity r8, com.google.android.ump.ConsentRequestParameters r9, com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener r10, com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener r11) {
            r7 = this;
            com.google.android.gms.internal.consent_sdk.zzq r6 = new com.google.android.gms.internal.consent_sdk.zzq
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.Executor r8 = r7.zzc
            r8.execute(r6)
            return
    }
}
