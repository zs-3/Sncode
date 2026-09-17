package com.google.android.datatransport.cct.internal;

@com.google.auto.value.AutoValue
/* loaded from: classes.dex */
public abstract class LogResponse {
    private static final java.lang.String LOG_TAG = "LogResponseInternal";

    public LogResponse() {
            r0 = this;
            r0.<init>()
            return
    }

    static com.google.android.datatransport.cct.internal.LogResponse create(long r1) {
            com.google.android.datatransport.cct.internal.AutoValue_LogResponse r0 = new com.google.android.datatransport.cct.internal.AutoValue_LogResponse
            r0.<init>(r1)
            return r0
    }

    public static com.google.android.datatransport.cct.internal.LogResponse fromJson(java.io.Reader r3) throws java.io.IOException {
            android.util.JsonReader r0 = new android.util.JsonReader
            r0.<init>(r3)
            r0.beginObject()     // Catch: java.lang.Throwable -> L4a
        L8:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L4a
            if (r3 == 0) goto L42
            java.lang.String r3 = r0.nextName()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r1 = "nextRequestWaitMillis"
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L4a
            if (r3 == 0) goto L3e
            android.util.JsonToken r3 = r0.peek()     // Catch: java.lang.Throwable -> L4a
            android.util.JsonToken r1 = android.util.JsonToken.STRING     // Catch: java.lang.Throwable -> L4a
            if (r3 != r1) goto L32
            java.lang.String r3 = r0.nextString()     // Catch: java.lang.Throwable -> L4a
            long r1 = java.lang.Long.parseLong(r3)     // Catch: java.lang.Throwable -> L4a
            com.google.android.datatransport.cct.internal.LogResponse r3 = create(r1)     // Catch: java.lang.Throwable -> L4a
            r0.close()
            return r3
        L32:
            long r1 = r0.nextLong()     // Catch: java.lang.Throwable -> L4a
            com.google.android.datatransport.cct.internal.LogResponse r3 = create(r1)     // Catch: java.lang.Throwable -> L4a
            r0.close()
            return r3
        L3e:
            r0.skipValue()     // Catch: java.lang.Throwable -> L4a
            goto L8
        L42:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L4a
            java.lang.String r1 = "Response is missing nextRequestWaitMillis field."
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L4a
            throw r3     // Catch: java.lang.Throwable -> L4a
        L4a:
            r3 = move-exception
            r0.close()
            throw r3
    }

    public abstract long getNextRequestWaitMillis();
}
