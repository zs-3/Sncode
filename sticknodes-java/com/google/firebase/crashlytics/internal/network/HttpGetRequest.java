package com.google.firebase.crashlytics.internal.network;

/* loaded from: classes2.dex */
public class HttpGetRequest {
    private final java.util.Map<java.lang.String, java.lang.String> headers;
    private final java.util.Map<java.lang.String, java.lang.String> queryParams;
    private final java.lang.String url;

    public HttpGetRequest(java.lang.String r1, java.util.Map<java.lang.String, java.lang.String> r2) {
            r0 = this;
            r0.<init>()
            r0.url = r1
            r0.queryParams = r2
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.headers = r1
            return
    }

    private java.lang.String createParamsString(java.util.Map<java.lang.String, java.lang.String> r7) throws java.io.UnsupportedEncodingException {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r2 = "="
            r0.append(r2)
            java.lang.Object r3 = r1.getValue()
            java.lang.String r4 = "UTF-8"
            java.lang.String r5 = ""
            if (r3 == 0) goto L36
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = java.net.URLEncoder.encode(r1, r4)
            goto L37
        L36:
            r1 = r5
        L37:
            r0.append(r1)
        L3a:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L6d
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.String r3 = "&"
            r0.append(r3)
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r0.append(r3)
            r0.append(r2)
            java.lang.Object r3 = r1.getValue()
            if (r3 == 0) goto L68
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = java.net.URLEncoder.encode(r1, r4)
            goto L69
        L68:
            r1 = r5
        L69:
            r0.append(r1)
            goto L3a
        L6d:
            java.lang.String r7 = r0.toString()
            return r7
    }

    private java.lang.String createUrlWithParams(java.lang.String r3, java.util.Map<java.lang.String, java.lang.String> r4) throws java.io.UnsupportedEncodingException {
            r2 = this;
            java.lang.String r4 = r2.createParamsString(r4)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto Lb
            return r3
        Lb:
            java.lang.String r0 = "?"
            boolean r1 = r3.contains(r0)
            if (r1 == 0) goto L3a
            java.lang.String r0 = "&"
            boolean r1 = r3.endsWith(r0)
            if (r1 != 0) goto L2a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
        L2a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            return r3
        L3a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r0)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            return r3
    }

    private java.lang.String readStream(java.io.InputStream r5) throws java.io.IOException {
            r4 = this;
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.lang.String r2 = "UTF-8"
            r1.<init>(r5, r2)
            r0.<init>(r1)
            r5 = 8192(0x2000, float:1.14794E-41)
            char[] r5 = new char[r5]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L15:
            int r2 = r0.read(r5)
            r3 = -1
            if (r2 == r3) goto L21
            r3 = 0
            r1.append(r5, r3, r2)
            goto L15
        L21:
            java.lang.String r5 = r1.toString()
            return r5
    }

    public com.google.firebase.crashlytics.internal.network.HttpResponse execute() throws java.io.IOException {
            r5 = this;
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.checkBlockingThread()
            r0 = 0
            java.lang.String r1 = r5.url     // Catch: java.lang.Throwable -> L87
            java.util.Map<java.lang.String, java.lang.String> r2 = r5.queryParams     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = r5.createUrlWithParams(r1, r2)     // Catch: java.lang.Throwable -> L87
            com.google.firebase.crashlytics.internal.Logger r2 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> L87
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L87
            r3.<init>()     // Catch: java.lang.Throwable -> L87
            java.lang.String r4 = "GET Request URL: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L87
            r3.append(r1)     // Catch: java.lang.Throwable -> L87
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L87
            r2.v(r3)     // Catch: java.lang.Throwable -> L87
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L87
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L87
            java.net.URLConnection r1 = r2.openConnection()     // Catch: java.lang.Throwable -> L87
            javax.net.ssl.HttpsURLConnection r1 = (javax.net.ssl.HttpsURLConnection) r1     // Catch: java.lang.Throwable -> L87
            r2 = 10000(0x2710, float:1.4013E-41)
            r1.setReadTimeout(r2)     // Catch: java.lang.Throwable -> L85
            r1.setConnectTimeout(r2)     // Catch: java.lang.Throwable -> L85
            java.lang.String r2 = "GET"
            r1.setRequestMethod(r2)     // Catch: java.lang.Throwable -> L85
            java.util.Map<java.lang.String, java.lang.String> r2 = r5.headers     // Catch: java.lang.Throwable -> L85
            java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> L85
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L85
        L46:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L85
            if (r3 == 0) goto L62
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L85
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L85
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L85
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L85
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L85
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L85
            r1.addRequestProperty(r4, r3)     // Catch: java.lang.Throwable -> L85
            goto L46
        L62:
            r1.connect()     // Catch: java.lang.Throwable -> L85
            int r2 = r1.getResponseCode()     // Catch: java.lang.Throwable -> L85
            java.io.InputStream r3 = r1.getInputStream()     // Catch: java.lang.Throwable -> L85
            if (r3 == 0) goto L77
            java.lang.String r0 = r5.readStream(r3)     // Catch: java.lang.Throwable -> L74
            goto L77
        L74:
            r2 = move-exception
            r0 = r3
            goto L89
        L77:
            if (r3 == 0) goto L7c
            r3.close()
        L7c:
            r1.disconnect()
            com.google.firebase.crashlytics.internal.network.HttpResponse r1 = new com.google.firebase.crashlytics.internal.network.HttpResponse
            r1.<init>(r2, r0)
            return r1
        L85:
            r2 = move-exception
            goto L89
        L87:
            r2 = move-exception
            r1 = r0
        L89:
            if (r0 == 0) goto L8e
            r0.close()
        L8e:
            if (r1 == 0) goto L93
            r1.disconnect()
        L93:
            throw r2
    }

    public com.google.firebase.crashlytics.internal.network.HttpGetRequest header(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.headers
            r0.put(r2, r3)
            return r1
    }
}
