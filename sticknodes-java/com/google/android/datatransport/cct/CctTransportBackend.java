package com.google.android.datatransport.cct;

/* loaded from: classes.dex */
final class CctTransportBackend implements com.google.android.datatransport.runtime.backends.TransportBackend {
    private static final java.lang.String ACCEPT_ENCODING_HEADER_KEY = "Accept-Encoding";
    static final java.lang.String API_KEY_HEADER_KEY = "X-Goog-Api-Key";
    private static final int CONNECTION_TIME_OUT = 30000;
    private static final java.lang.String CONTENT_ENCODING_HEADER_KEY = "Content-Encoding";
    private static final java.lang.String CONTENT_TYPE_HEADER_KEY = "Content-Type";
    private static final java.lang.String GZIP_CONTENT_ENCODING = "gzip";
    private static final int INVALID_VERSION_CODE = -1;
    private static final java.lang.String JSON_CONTENT_TYPE = "application/json";
    private static final java.lang.String KEY_APPLICATION_BUILD = "application_build";
    private static final java.lang.String KEY_COUNTRY = "country";
    private static final java.lang.String KEY_DEVICE = "device";
    private static final java.lang.String KEY_FINGERPRINT = "fingerprint";
    private static final java.lang.String KEY_HARDWARE = "hardware";
    private static final java.lang.String KEY_LOCALE = "locale";
    private static final java.lang.String KEY_MANUFACTURER = "manufacturer";
    private static final java.lang.String KEY_MCC_MNC = "mcc_mnc";
    static final java.lang.String KEY_MOBILE_SUBTYPE = "mobile-subtype";
    private static final java.lang.String KEY_MODEL = "model";
    static final java.lang.String KEY_NETWORK_TYPE = "net-type";
    private static final java.lang.String KEY_OS_BUILD = "os-uild";
    private static final java.lang.String KEY_PRODUCT = "product";
    private static final java.lang.String KEY_SDK_VERSION = "sdk-version";
    private static final java.lang.String KEY_TIMEZONE_OFFSET = "tz-offset";
    private static final java.lang.String LOG_TAG = "CctTransportBackend";
    private static final int READ_TIME_OUT = 130000;
    private final android.content.Context applicationContext;
    private final android.net.ConnectivityManager connectivityManager;
    private final com.google.firebase.encoders.DataEncoder dataEncoder;
    final java.net.URL endPoint;
    private final int readTimeout;
    private final com.google.android.datatransport.runtime.time.Clock uptimeClock;
    private final com.google.android.datatransport.runtime.time.Clock wallTimeClock;

    static final class HttpRequest {
        final java.lang.String apiKey;
        final com.google.android.datatransport.cct.internal.BatchedLogRequest requestBody;
        final java.net.URL url;

        HttpRequest(java.net.URL r1, com.google.android.datatransport.cct.internal.BatchedLogRequest r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.url = r1
                r0.requestBody = r2
                r0.apiKey = r3
                return
        }

        com.google.android.datatransport.cct.CctTransportBackend.HttpRequest withUrl(java.net.URL r4) {
                r3 = this;
                com.google.android.datatransport.cct.CctTransportBackend$HttpRequest r0 = new com.google.android.datatransport.cct.CctTransportBackend$HttpRequest
                com.google.android.datatransport.cct.internal.BatchedLogRequest r1 = r3.requestBody
                java.lang.String r2 = r3.apiKey
                r0.<init>(r4, r1, r2)
                return r0
        }
    }

    static final class HttpResponse {
        final int code;
        final long nextRequestMillis;
        final java.net.URL redirectUrl;

        HttpResponse(int r1, java.net.URL r2, long r3) {
                r0 = this;
                r0.<init>()
                r0.code = r1
                r0.redirectUrl = r2
                r0.nextRequestMillis = r3
                return
        }
    }

    /* renamed from: $r8$lambda$S-r8nBLtE2gbjrB4Xb4-7yhMlbw, reason: not valid java name */
    public static /* synthetic */ com.google.android.datatransport.cct.CctTransportBackend.HttpRequest m18$r8$lambda$Sr8nBLtE2gbjrB4Xb47yhMlbw(com.google.android.datatransport.cct.CctTransportBackend.HttpRequest r0, com.google.android.datatransport.cct.CctTransportBackend.HttpResponse r1) {
            com.google.android.datatransport.cct.CctTransportBackend$HttpRequest r0 = lambda$send$0(r0, r1)
            return r0
    }

    public static /* synthetic */ com.google.android.datatransport.cct.CctTransportBackend.HttpResponse $r8$lambda$bLAzIpNF4NtapXlUpPVGhzxyNT8(com.google.android.datatransport.cct.CctTransportBackend r0, com.google.android.datatransport.cct.CctTransportBackend.HttpRequest r1) {
            com.google.android.datatransport.cct.CctTransportBackend$HttpResponse r0 = r0.doSend(r1)
            return r0
    }

    CctTransportBackend(android.content.Context r2, com.google.android.datatransport.runtime.time.Clock r3, com.google.android.datatransport.runtime.time.Clock r4) {
            r1 = this;
            r0 = 130000(0x1fbd0, float:1.82169E-40)
            r1.<init>(r2, r3, r4, r0)
            return
    }

    CctTransportBackend(android.content.Context r2, com.google.android.datatransport.runtime.time.Clock r3, com.google.android.datatransport.runtime.time.Clock r4, int r5) {
            r1 = this;
            r1.<init>()
            com.google.firebase.encoders.DataEncoder r0 = com.google.android.datatransport.cct.internal.BatchedLogRequest.createDataEncoder()
            r1.dataEncoder = r0
            r1.applicationContext = r2
            java.lang.String r0 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            r1.connectivityManager = r2
            java.lang.String r2 = com.google.android.datatransport.cct.CCTDestination.DEFAULT_END_POINT
            java.net.URL r2 = parseUrlOrThrow(r2)
            r1.endPoint = r2
            r1.uptimeClock = r4
            r1.wallTimeClock = r3
            r1.readTimeout = r5
            return
    }

    private com.google.android.datatransport.cct.CctTransportBackend.HttpResponse doSend(com.google.android.datatransport.cct.CctTransportBackend.HttpRequest r13) throws java.io.IOException {
            r12 = this;
            java.net.URL r0 = r13.url
            java.lang.String r1 = "CctTransportBackend"
            java.lang.String r2 = "Making request to: %s"
            com.google.android.datatransport.runtime.logging.Logging.i(r1, r2, r0)
            java.net.URL r0 = r13.url
            java.net.URLConnection r0 = r0.openConnection()
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
            r2 = 30000(0x7530, float:4.2039E-41)
            r0.setConnectTimeout(r2)
            int r2 = r12.readTimeout
            r0.setReadTimeout(r2)
            r2 = 1
            r0.setDoOutput(r2)
            r3 = 0
            r0.setInstanceFollowRedirects(r3)
            java.lang.String r4 = "POST"
            r0.setRequestMethod(r4)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = "3.3.0"
            r2[r3] = r4
            java.lang.String r3 = "datatransport/%s android/"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.String r3 = "User-Agent"
            r0.setRequestProperty(r3, r2)
            java.lang.String r2 = "Content-Encoding"
            java.lang.String r3 = "gzip"
            r0.setRequestProperty(r2, r3)
            java.lang.String r4 = "Content-Type"
            java.lang.String r5 = "application/json"
            r0.setRequestProperty(r4, r5)
            java.lang.String r5 = "Accept-Encoding"
            r0.setRequestProperty(r5, r3)
            java.lang.String r3 = r13.apiKey
            if (r3 == 0) goto L55
            java.lang.String r5 = "X-Goog-Api-Key"
            r0.setRequestProperty(r5, r3)
        L55:
            r5 = 0
            r3 = 0
            java.io.OutputStream r7 = r0.getOutputStream()     // Catch: java.io.IOException -> L11d com.google.firebase.encoders.EncodingException -> L11f java.net.UnknownHostException -> L12d java.net.ConnectException -> L12f
            java.util.zip.GZIPOutputStream r8 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L111
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L111
            com.google.firebase.encoders.DataEncoder r9 = r12.dataEncoder     // Catch: java.lang.Throwable -> L107
            com.google.android.datatransport.cct.internal.BatchedLogRequest r13 = r13.requestBody     // Catch: java.lang.Throwable -> L107
            java.io.BufferedWriter r10 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L107
            java.io.OutputStreamWriter r11 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L107
            r11.<init>(r8)     // Catch: java.lang.Throwable -> L107
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L107
            r9.encode(r13, r10)     // Catch: java.lang.Throwable -> L107
            r8.close()     // Catch: java.lang.Throwable -> L111
            if (r7 == 0) goto L7a
            r7.close()     // Catch: java.io.IOException -> L11d com.google.firebase.encoders.EncodingException -> L11f java.net.UnknownHostException -> L12d java.net.ConnectException -> L12f
        L7a:
            int r13 = r0.getResponseCode()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
            java.lang.String r8 = "Status Code: %d"
            com.google.android.datatransport.runtime.logging.Logging.i(r1, r8, r7)
            java.lang.String r4 = r0.getHeaderField(r4)
            java.lang.String r7 = "Content-Type: %s"
            com.google.android.datatransport.runtime.logging.Logging.d(r1, r7, r4)
            java.lang.String r4 = r0.getHeaderField(r2)
            java.lang.String r7 = "Content-Encoding: %s"
            com.google.android.datatransport.runtime.logging.Logging.d(r1, r7, r4)
            r1 = 302(0x12e, float:4.23E-43)
            if (r13 == r1) goto Lf6
            r1 = 301(0x12d, float:4.22E-43)
            if (r13 == r1) goto Lf6
            r1 = 307(0x133, float:4.3E-43)
            if (r13 != r1) goto La6
            goto Lf6
        La6:
            r1 = 200(0xc8, float:2.8E-43)
            if (r13 == r1) goto Lb0
            com.google.android.datatransport.cct.CctTransportBackend$HttpResponse r0 = new com.google.android.datatransport.cct.CctTransportBackend$HttpResponse
            r0.<init>(r13, r3, r5)
            return r0
        Lb0:
            java.io.InputStream r1 = r0.getInputStream()
            java.lang.String r0 = r0.getHeaderField(r2)     // Catch: java.lang.Throwable -> Lea
            java.io.InputStream r0 = maybeUnGzip(r1, r0)     // Catch: java.lang.Throwable -> Lea
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> Lde
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> Lde
            r4.<init>(r0)     // Catch: java.lang.Throwable -> Lde
            r2.<init>(r4)     // Catch: java.lang.Throwable -> Lde
            com.google.android.datatransport.cct.internal.LogResponse r2 = com.google.android.datatransport.cct.internal.LogResponse.fromJson(r2)     // Catch: java.lang.Throwable -> Lde
            long r4 = r2.getNextRequestWaitMillis()     // Catch: java.lang.Throwable -> Lde
            com.google.android.datatransport.cct.CctTransportBackend$HttpResponse r2 = new com.google.android.datatransport.cct.CctTransportBackend$HttpResponse     // Catch: java.lang.Throwable -> Lde
            r2.<init>(r13, r3, r4)     // Catch: java.lang.Throwable -> Lde
            if (r0 == 0) goto Ld8
            r0.close()     // Catch: java.lang.Throwable -> Lea
        Ld8:
            if (r1 == 0) goto Ldd
            r1.close()
        Ldd:
            return r2
        Lde:
            r13 = move-exception
            if (r0 == 0) goto Le9
            r0.close()     // Catch: java.lang.Throwable -> Le5
            goto Le9
        Le5:
            r0 = move-exception
            r13.addSuppressed(r0)     // Catch: java.lang.Throwable -> Lea
        Le9:
            throw r13     // Catch: java.lang.Throwable -> Lea
        Lea:
            r13 = move-exception
            if (r1 == 0) goto Lf5
            r1.close()     // Catch: java.lang.Throwable -> Lf1
            goto Lf5
        Lf1:
            r0 = move-exception
            r13.addSuppressed(r0)
        Lf5:
            throw r13
        Lf6:
            java.lang.String r1 = "Location"
            java.lang.String r0 = r0.getHeaderField(r1)
            com.google.android.datatransport.cct.CctTransportBackend$HttpResponse r1 = new com.google.android.datatransport.cct.CctTransportBackend$HttpResponse
            java.net.URL r2 = new java.net.URL
            r2.<init>(r0)
            r1.<init>(r13, r2, r5)
            return r1
        L107:
            r13 = move-exception
            r8.close()     // Catch: java.lang.Throwable -> L10c
            goto L110
        L10c:
            r0 = move-exception
            r13.addSuppressed(r0)     // Catch: java.lang.Throwable -> L111
        L110:
            throw r13     // Catch: java.lang.Throwable -> L111
        L111:
            r13 = move-exception
            if (r7 == 0) goto L11c
            r7.close()     // Catch: java.lang.Throwable -> L118
            goto L11c
        L118:
            r0 = move-exception
            r13.addSuppressed(r0)     // Catch: java.io.IOException -> L11d com.google.firebase.encoders.EncodingException -> L11f java.net.UnknownHostException -> L12d java.net.ConnectException -> L12f
        L11c:
            throw r13     // Catch: java.io.IOException -> L11d com.google.firebase.encoders.EncodingException -> L11f java.net.UnknownHostException -> L12d java.net.ConnectException -> L12f
        L11d:
            r13 = move-exception
            goto L120
        L11f:
            r13 = move-exception
        L120:
            java.lang.String r0 = "Couldn't encode request, returning with 400"
            com.google.android.datatransport.runtime.logging.Logging.e(r1, r0, r13)
            com.google.android.datatransport.cct.CctTransportBackend$HttpResponse r13 = new com.google.android.datatransport.cct.CctTransportBackend$HttpResponse
            r0 = 400(0x190, float:5.6E-43)
            r13.<init>(r0, r3, r5)
            return r13
        L12d:
            r13 = move-exception
            goto L130
        L12f:
            r13 = move-exception
        L130:
            java.lang.String r0 = "Couldn't open connection, returning with 500"
            com.google.android.datatransport.runtime.logging.Logging.e(r1, r0, r13)
            com.google.android.datatransport.cct.CctTransportBackend$HttpResponse r13 = new com.google.android.datatransport.cct.CctTransportBackend$HttpResponse
            r0 = 500(0x1f4, float:7.0E-43)
            r13.<init>(r0, r3, r5)
            return r13
    }

    private static java.lang.String getMccMncOrEmpty(android.content.Context r0) {
            android.telephony.TelephonyManager r0 = getTelephonyManager(r0)
            java.lang.String r0 = r0.getSimOperator()
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.lang.String r0 = ""
            return r0
    }

    private static int getNetSubtypeValue(android.net.NetworkInfo r1) {
            if (r1 != 0) goto L9
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r1 = com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype.UNKNOWN_MOBILE_SUBTYPE
            int r1 = r1.getValue()
            return r1
        L9:
            int r1 = r1.getSubtype()
            r0 = -1
            if (r1 != r0) goto L17
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r1 = com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype.COMBINED
            int r1 = r1.getValue()
            return r1
        L17:
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r0 = com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype.forNumber(r1)
            if (r0 == 0) goto L1e
            goto L1f
        L1e:
            r1 = 0
        L1f:
            return r1
    }

    private static int getNetTypeValue(android.net.NetworkInfo r0) {
            if (r0 != 0) goto L9
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType r0 = com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType.NONE
            int r0 = r0.getValue()
            return r0
        L9:
            int r0 = r0.getType()
            return r0
    }

    private static int getPackageVersionCode(android.content.Context r2) {
            android.content.pm.PackageManager r0 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L10
            java.lang.String r2 = r2.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L10
            r1 = 0
            android.content.pm.PackageInfo r2 = r0.getPackageInfo(r2, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L10
            int r2 = r2.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L10
            return r2
        L10:
            r2 = move-exception
            java.lang.String r0 = "CctTransportBackend"
            java.lang.String r1 = "Unable to find version code for package"
            com.google.android.datatransport.runtime.logging.Logging.e(r0, r1, r2)
            r2 = -1
            return r2
    }

    private com.google.android.datatransport.cct.internal.BatchedLogRequest getRequestBody(com.google.android.datatransport.runtime.backends.BackendRequest r11) {
            r10 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Iterable r11 = r11.getEvents()
            java.util.Iterator r11 = r11.iterator()
        Ld:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L39
            java.lang.Object r1 = r11.next()
            com.google.android.datatransport.runtime.EventInternal r1 = (com.google.android.datatransport.runtime.EventInternal) r1
            java.lang.String r2 = r1.getTransportName()
            boolean r3 = r0.containsKey(r2)
            if (r3 != 0) goto L2f
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r3.add(r1)
            r0.put(r2, r3)
            goto Ld
        L2f:
            java.lang.Object r2 = r0.get(r2)
            java.util.List r2 = (java.util.List) r2
            r2.add(r1)
            goto Ld
        L39:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L46:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L259
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.List r2 = (java.util.List) r2
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            com.google.android.datatransport.runtime.EventInternal r2 = (com.google.android.datatransport.runtime.EventInternal) r2
            com.google.android.datatransport.cct.internal.LogRequest$Builder r3 = com.google.android.datatransport.cct.internal.LogRequest.builder()
            com.google.android.datatransport.cct.internal.QosTier r4 = com.google.android.datatransport.cct.internal.QosTier.DEFAULT
            com.google.android.datatransport.cct.internal.LogRequest$Builder r3 = r3.setQosTier(r4)
            com.google.android.datatransport.runtime.time.Clock r4 = r10.wallTimeClock
            long r4 = r4.getTime()
            com.google.android.datatransport.cct.internal.LogRequest$Builder r3 = r3.setRequestTimeMs(r4)
            com.google.android.datatransport.runtime.time.Clock r4 = r10.uptimeClock
            long r4 = r4.getTime()
            com.google.android.datatransport.cct.internal.LogRequest$Builder r3 = r3.setRequestUptimeMs(r4)
            com.google.android.datatransport.cct.internal.ClientInfo$Builder r4 = com.google.android.datatransport.cct.internal.ClientInfo.builder()
            com.google.android.datatransport.cct.internal.ClientInfo$ClientType r5 = com.google.android.datatransport.cct.internal.ClientInfo.ClientType.ANDROID_FIREBASE
            com.google.android.datatransport.cct.internal.ClientInfo$Builder r4 = r4.setClientType(r5)
            com.google.android.datatransport.cct.internal.AndroidClientInfo$Builder r5 = com.google.android.datatransport.cct.internal.AndroidClientInfo.builder()
            java.lang.String r6 = "sdk-version"
            int r6 = r2.getInteger(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.google.android.datatransport.cct.internal.AndroidClientInfo$Builder r5 = r5.setSdkVersion(r6)
            java.lang.String r6 = "model"
            java.lang.String r6 = r2.get(r6)
            com.google.android.datatransport.cct.internal.AndroidClientInfo$Builder r5 = r5.setModel(r6)
            java.lang.String r6 = "hardware"
            java.lang.String r6 = r2.get(r6)
            com.google.android.datatransport.cct.internal.AndroidClientInfo$Builder r5 = r5.setHardware(r6)
            java.lang.String r6 = "device"
            java.lang.String r6 = r2.get(r6)
            com.google.android.datatransport.cct.internal.AndroidClientInfo$Builder r5 = r5.setDevice(r6)
            java.lang.String r6 = "product"
            java.lang.String r6 = r2.get(r6)
            com.google.android.datatransport.cct.internal.AndroidClientInfo$Builder r5 = r5.setProduct(r6)
            java.lang.String r6 = "os-uild"
            java.lang.String r6 = r2.get(r6)
            com.google.android.datatransport.cct.internal.AndroidClientInfo$Builder r5 = r5.setOsBuild(r6)
            java.lang.String r6 = "manufacturer"
            java.lang.String r6 = r2.get(r6)
            com.google.android.datatransport.cct.internal.AndroidClientInfo$Builder r5 = r5.setManufacturer(r6)
            java.lang.String r6 = "fingerprint"
            java.lang.String r6 = r2.get(r6)
            com.google.android.datatransport.cct.internal.AndroidClientInfo$Builder r5 = r5.setFingerprint(r6)
            java.lang.String r6 = "country"
            java.lang.String r6 = r2.get(r6)
            com.google.android.datatransport.cct.internal.AndroidClientInfo$Builder r5 = r5.setCountry(r6)
            java.lang.String r6 = "locale"
            java.lang.String r6 = r2.get(r6)
            com.google.android.datatransport.cct.internal.AndroidClientInfo$Builder r5 = r5.setLocale(r6)
            java.lang.String r6 = "mcc_mnc"
            java.lang.String r6 = r2.get(r6)
            com.google.android.datatransport.cct.internal.AndroidClientInfo$Builder r5 = r5.setMccMnc(r6)
            java.lang.String r6 = "application_build"
            java.lang.String r2 = r2.get(r6)
            com.google.android.datatransport.cct.internal.AndroidClientInfo$Builder r2 = r5.setApplicationBuild(r2)
            com.google.android.datatransport.cct.internal.AndroidClientInfo r2 = r2.build()
            com.google.android.datatransport.cct.internal.ClientInfo$Builder r2 = r4.setAndroidClientInfo(r2)
            com.google.android.datatransport.cct.internal.ClientInfo r2 = r2.build()
            com.google.android.datatransport.cct.internal.LogRequest$Builder r2 = r3.setClientInfo(r2)
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.NumberFormatException -> L125
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.NumberFormatException -> L125
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L125
            r2.setSource(r3)     // Catch: java.lang.NumberFormatException -> L125
            goto L12e
        L125:
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r2.setSource(r3)
        L12e:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r1 = r1.iterator()
        L13d:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L24d
            java.lang.Object r4 = r1.next()
            com.google.android.datatransport.runtime.EventInternal r4 = (com.google.android.datatransport.runtime.EventInternal) r4
            com.google.android.datatransport.runtime.EncodedPayload r5 = r4.getEncodedPayload()
            com.google.android.datatransport.Encoding r6 = r5.getEncoding()
            java.lang.String r7 = "proto"
            com.google.android.datatransport.Encoding r7 = com.google.android.datatransport.Encoding.of(r7)
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L166
            byte[] r5 = r5.getBytes()
            com.google.android.datatransport.cct.internal.LogEvent$Builder r5 = com.google.android.datatransport.cct.internal.LogEvent.protoBuilder(r5)
            goto L185
        L166:
            java.lang.String r7 = "json"
            com.google.android.datatransport.Encoding r7 = com.google.android.datatransport.Encoding.of(r7)
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L244
            java.lang.String r6 = new java.lang.String
            byte[] r5 = r5.getBytes()
            java.lang.String r7 = "UTF-8"
            java.nio.charset.Charset r7 = java.nio.charset.Charset.forName(r7)
            r6.<init>(r5, r7)
            com.google.android.datatransport.cct.internal.LogEvent$Builder r5 = com.google.android.datatransport.cct.internal.LogEvent.jsonBuilder(r6)
        L185:
            long r6 = r4.getEventMillis()
            com.google.android.datatransport.cct.internal.LogEvent$Builder r6 = r5.setEventTimeMs(r6)
            long r7 = r4.getUptimeMillis()
            com.google.android.datatransport.cct.internal.LogEvent$Builder r6 = r6.setEventUptimeMs(r7)
            java.lang.String r7 = "tz-offset"
            long r7 = r4.getLong(r7)
            com.google.android.datatransport.cct.internal.LogEvent$Builder r6 = r6.setTimezoneOffsetSeconds(r7)
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo$Builder r7 = com.google.android.datatransport.cct.internal.NetworkConnectionInfo.builder()
            java.lang.String r8 = "net-type"
            int r8 = r4.getInteger(r8)
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType r8 = com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType.forNumber(r8)
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo$Builder r7 = r7.setNetworkType(r8)
            java.lang.String r8 = "mobile-subtype"
            int r8 = r4.getInteger(r8)
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r8 = com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype.forNumber(r8)
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo$Builder r7 = r7.setMobileSubtype(r8)
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo r7 = r7.build()
            r6.setNetworkConnectionInfo(r7)
            java.lang.Integer r6 = r4.getCode()
            if (r6 == 0) goto L1d3
            java.lang.Integer r6 = r4.getCode()
            r5.setEventCode(r6)
        L1d3:
            java.lang.Integer r6 = r4.getProductId()
            if (r6 == 0) goto L20a
            com.google.android.datatransport.cct.internal.ComplianceData$Builder r6 = com.google.android.datatransport.cct.internal.ComplianceData.builder()
            com.google.android.datatransport.cct.internal.ExternalPrivacyContext$Builder r7 = com.google.android.datatransport.cct.internal.ExternalPrivacyContext.builder()
            com.google.android.datatransport.cct.internal.ExternalPRequestContext$Builder r8 = com.google.android.datatransport.cct.internal.ExternalPRequestContext.builder()
            java.lang.Integer r9 = r4.getProductId()
            com.google.android.datatransport.cct.internal.ExternalPRequestContext$Builder r8 = r8.setOriginAssociatedProductId(r9)
            com.google.android.datatransport.cct.internal.ExternalPRequestContext r8 = r8.build()
            com.google.android.datatransport.cct.internal.ExternalPrivacyContext$Builder r7 = r7.setPrequest(r8)
            com.google.android.datatransport.cct.internal.ExternalPrivacyContext r7 = r7.build()
            com.google.android.datatransport.cct.internal.ComplianceData$Builder r6 = r6.setPrivacyContext(r7)
            com.google.android.datatransport.cct.internal.ComplianceData$ProductIdOrigin r7 = com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin.EVENT_OVERRIDE
            com.google.android.datatransport.cct.internal.ComplianceData$Builder r6 = r6.setProductIdOrigin(r7)
            com.google.android.datatransport.cct.internal.ComplianceData r6 = r6.build()
            r5.setComplianceData(r6)
        L20a:
            byte[] r6 = r4.getExperimentIdsClear()
            if (r6 != 0) goto L216
            byte[] r6 = r4.getExperimentIdsEncrypted()
            if (r6 == 0) goto L23b
        L216:
            com.google.android.datatransport.cct.internal.ExperimentIds$Builder r6 = com.google.android.datatransport.cct.internal.ExperimentIds.builder()
            byte[] r7 = r4.getExperimentIdsClear()
            if (r7 == 0) goto L227
            byte[] r7 = r4.getExperimentIdsClear()
            r6.setClearBlob(r7)
        L227:
            byte[] r7 = r4.getExperimentIdsEncrypted()
            if (r7 == 0) goto L234
            byte[] r4 = r4.getExperimentIdsEncrypted()
            r6.setEncryptedBlob(r4)
        L234:
            com.google.android.datatransport.cct.internal.ExperimentIds r4 = r6.build()
            r5.setExperimentIds(r4)
        L23b:
            com.google.android.datatransport.cct.internal.LogEvent r4 = r5.build()
            r3.add(r4)
            goto L13d
        L244:
            java.lang.String r4 = "CctTransportBackend"
            java.lang.String r5 = "Received event of unsupported encoding %s. Skipping..."
            com.google.android.datatransport.runtime.logging.Logging.w(r4, r5, r6)
            goto L13d
        L24d:
            r2.setLogEvents(r3)
            com.google.android.datatransport.cct.internal.LogRequest r1 = r2.build()
            r11.add(r1)
            goto L46
        L259:
            com.google.android.datatransport.cct.internal.BatchedLogRequest r11 = com.google.android.datatransport.cct.internal.BatchedLogRequest.create(r11)
            return r11
    }

    private static android.telephony.TelephonyManager getTelephonyManager(android.content.Context r1) {
            java.lang.String r0 = "phone"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1
            return r1
    }

    static long getTzOffset() {
            java.util.Calendar.getInstance()
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            long r1 = r1.getTimeInMillis()
            int r0 = r0.getOffset(r1)
            int r0 = r0 / 1000
            long r0 = (long) r0
            return r0
    }

    private static /* synthetic */ com.google.android.datatransport.cct.CctTransportBackend.HttpRequest lambda$send$0(com.google.android.datatransport.cct.CctTransportBackend.HttpRequest r3, com.google.android.datatransport.cct.CctTransportBackend.HttpResponse r4) {
            java.net.URL r0 = r4.redirectUrl
            if (r0 == 0) goto L12
            java.lang.String r1 = "CctTransportBackend"
            java.lang.String r2 = "Following redirect to: %s"
            com.google.android.datatransport.runtime.logging.Logging.d(r1, r2, r0)
            java.net.URL r4 = r4.redirectUrl
            com.google.android.datatransport.cct.CctTransportBackend$HttpRequest r3 = r3.withUrl(r4)
            return r3
        L12:
            r3 = 0
            return r3
    }

    private static java.io.InputStream maybeUnGzip(java.io.InputStream r1, java.lang.String r2) throws java.io.IOException {
            java.lang.String r0 = "gzip"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto Le
            java.util.zip.GZIPInputStream r2 = new java.util.zip.GZIPInputStream
            r2.<init>(r1)
            return r2
        Le:
            return r1
    }

    private static java.net.URL parseUrlOrThrow(java.lang.String r4) {
            java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> L6
            r0.<init>(r4)     // Catch: java.net.MalformedURLException -> L6
            return r0
        L6:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid url: "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4, r0)
            throw r1
    }

    @Override // com.google.android.datatransport.runtime.backends.TransportBackend
    public com.google.android.datatransport.runtime.EventInternal decorate(com.google.android.datatransport.runtime.EventInternal r5) {
            r4 = this;
            android.net.ConnectivityManager r0 = r4.connectivityManager
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            com.google.android.datatransport.runtime.EventInternal$Builder r5 = r5.toBuilder()
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.String r2 = "sdk-version"
            com.google.android.datatransport.runtime.EventInternal$Builder r5 = r5.addMetadata(r2, r1)
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r2 = "model"
            com.google.android.datatransport.runtime.EventInternal$Builder r5 = r5.addMetadata(r2, r1)
            java.lang.String r1 = android.os.Build.HARDWARE
            java.lang.String r2 = "hardware"
            com.google.android.datatransport.runtime.EventInternal$Builder r5 = r5.addMetadata(r2, r1)
            java.lang.String r1 = android.os.Build.DEVICE
            java.lang.String r2 = "device"
            com.google.android.datatransport.runtime.EventInternal$Builder r5 = r5.addMetadata(r2, r1)
            java.lang.String r1 = android.os.Build.PRODUCT
            java.lang.String r2 = "product"
            com.google.android.datatransport.runtime.EventInternal$Builder r5 = r5.addMetadata(r2, r1)
            java.lang.String r1 = android.os.Build.ID
            java.lang.String r2 = "os-uild"
            com.google.android.datatransport.runtime.EventInternal$Builder r5 = r5.addMetadata(r2, r1)
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r2 = "manufacturer"
            com.google.android.datatransport.runtime.EventInternal$Builder r5 = r5.addMetadata(r2, r1)
            java.lang.String r1 = android.os.Build.FINGERPRINT
            java.lang.String r2 = "fingerprint"
            com.google.android.datatransport.runtime.EventInternal$Builder r5 = r5.addMetadata(r2, r1)
            long r1 = getTzOffset()
            java.lang.String r3 = "tz-offset"
            com.google.android.datatransport.runtime.EventInternal$Builder r5 = r5.addMetadata(r3, r1)
            int r1 = getNetTypeValue(r0)
            java.lang.String r2 = "net-type"
            com.google.android.datatransport.runtime.EventInternal$Builder r5 = r5.addMetadata(r2, r1)
            int r0 = getNetSubtypeValue(r0)
            java.lang.String r1 = "mobile-subtype"
            com.google.android.datatransport.runtime.EventInternal$Builder r5 = r5.addMetadata(r1, r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getCountry()
            java.lang.String r1 = "country"
            com.google.android.datatransport.runtime.EventInternal$Builder r5 = r5.addMetadata(r1, r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            java.lang.String r1 = "locale"
            com.google.android.datatransport.runtime.EventInternal$Builder r5 = r5.addMetadata(r1, r0)
            android.content.Context r0 = r4.applicationContext
            java.lang.String r0 = getMccMncOrEmpty(r0)
            java.lang.String r1 = "mcc_mnc"
            com.google.android.datatransport.runtime.EventInternal$Builder r5 = r5.addMetadata(r1, r0)
            android.content.Context r0 = r4.applicationContext
            int r0 = getPackageVersionCode(r0)
            java.lang.String r0 = java.lang.Integer.toString(r0)
            java.lang.String r1 = "application_build"
            com.google.android.datatransport.runtime.EventInternal$Builder r5 = r5.addMetadata(r1, r0)
            com.google.android.datatransport.runtime.EventInternal r5 = r5.build()
            return r5
    }

    @Override // com.google.android.datatransport.runtime.backends.TransportBackend
    public com.google.android.datatransport.runtime.backends.BackendResponse send(com.google.android.datatransport.runtime.backends.BackendRequest r5) {
            r4 = this;
            com.google.android.datatransport.cct.internal.BatchedLogRequest r0 = r4.getRequestBody(r5)
            java.net.URL r1 = r4.endPoint
            byte[] r2 = r5.getExtras()
            r3 = 0
            if (r2 == 0) goto L35
            byte[] r5 = r5.getExtras()     // Catch: java.lang.IllegalArgumentException -> L30
            com.google.android.datatransport.cct.CCTDestination r5 = com.google.android.datatransport.cct.CCTDestination.fromByteArray(r5)     // Catch: java.lang.IllegalArgumentException -> L30
            java.lang.String r2 = r5.getAPIKey()     // Catch: java.lang.IllegalArgumentException -> L30
            if (r2 == 0) goto L20
            java.lang.String r2 = r5.getAPIKey()     // Catch: java.lang.IllegalArgumentException -> L30
            r3 = r2
        L20:
            java.lang.String r2 = r5.getEndPoint()     // Catch: java.lang.IllegalArgumentException -> L30
            if (r2 == 0) goto L35
            java.lang.String r5 = r5.getEndPoint()     // Catch: java.lang.IllegalArgumentException -> L30
            java.net.URL r5 = parseUrlOrThrow(r5)     // Catch: java.lang.IllegalArgumentException -> L30
            r1 = r5
            goto L35
        L30:
            com.google.android.datatransport.runtime.backends.BackendResponse r5 = com.google.android.datatransport.runtime.backends.BackendResponse.fatalError()
            return r5
        L35:
            r5 = 5
            com.google.android.datatransport.cct.CctTransportBackend$HttpRequest r2 = new com.google.android.datatransport.cct.CctTransportBackend$HttpRequest     // Catch: java.io.IOException -> L71
            r2.<init>(r1, r0, r3)     // Catch: java.io.IOException -> L71
            com.google.android.datatransport.cct.CctTransportBackend$$ExternalSyntheticLambda0 r0 = new com.google.android.datatransport.cct.CctTransportBackend$$ExternalSyntheticLambda0     // Catch: java.io.IOException -> L71
            r0.<init>(r4)     // Catch: java.io.IOException -> L71
            com.google.android.datatransport.cct.CctTransportBackend$$ExternalSyntheticLambda1 r1 = com.google.android.datatransport.cct.CctTransportBackend$$ExternalSyntheticLambda1.INSTANCE     // Catch: java.io.IOException -> L71
            java.lang.Object r5 = com.google.android.datatransport.runtime.retries.Retries.retry(r5, r2, r0, r1)     // Catch: java.io.IOException -> L71
            com.google.android.datatransport.cct.CctTransportBackend$HttpResponse r5 = (com.google.android.datatransport.cct.CctTransportBackend.HttpResponse) r5     // Catch: java.io.IOException -> L71
            int r0 = r5.code     // Catch: java.io.IOException -> L71
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto L55
            long r0 = r5.nextRequestMillis     // Catch: java.io.IOException -> L71
            com.google.android.datatransport.runtime.backends.BackendResponse r5 = com.google.android.datatransport.runtime.backends.BackendResponse.ok(r0)     // Catch: java.io.IOException -> L71
            return r5
        L55:
            r5 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r5) goto L6c
            r5 = 404(0x194, float:5.66E-43)
            if (r0 != r5) goto L5e
            goto L6c
        L5e:
            r5 = 400(0x190, float:5.6E-43)
            if (r0 != r5) goto L67
            com.google.android.datatransport.runtime.backends.BackendResponse r5 = com.google.android.datatransport.runtime.backends.BackendResponse.invalidPayload()     // Catch: java.io.IOException -> L71
            return r5
        L67:
            com.google.android.datatransport.runtime.backends.BackendResponse r5 = com.google.android.datatransport.runtime.backends.BackendResponse.fatalError()     // Catch: java.io.IOException -> L71
            return r5
        L6c:
            com.google.android.datatransport.runtime.backends.BackendResponse r5 = com.google.android.datatransport.runtime.backends.BackendResponse.transientError()     // Catch: java.io.IOException -> L71
            return r5
        L71:
            r5 = move-exception
            java.lang.String r0 = "CctTransportBackend"
            java.lang.String r1 = "Could not make request to the backend"
            com.google.android.datatransport.runtime.logging.Logging.e(r0, r1, r5)
            com.google.android.datatransport.runtime.backends.BackendResponse r5 = com.google.android.datatransport.runtime.backends.BackendResponse.transientError()
            return r5
    }
}
