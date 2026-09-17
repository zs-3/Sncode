package com.google.android.datatransport.cct.internal;

@com.google.auto.value.AutoValue
/* loaded from: classes.dex */
public abstract class BatchedLogRequest {
    public BatchedLogRequest() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.datatransport.cct.internal.BatchedLogRequest create(java.util.List<com.google.android.datatransport.cct.internal.LogRequest> r1) {
            com.google.android.datatransport.cct.internal.AutoValue_BatchedLogRequest r0 = new com.google.android.datatransport.cct.internal.AutoValue_BatchedLogRequest
            r0.<init>(r1)
            return r0
    }

    public static com.google.firebase.encoders.DataEncoder createDataEncoder() {
            com.google.firebase.encoders.json.JsonDataEncoderBuilder r0 = new com.google.firebase.encoders.json.JsonDataEncoderBuilder
            r0.<init>()
            com.google.firebase.encoders.config.Configurator r1 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.CONFIG
            com.google.firebase.encoders.json.JsonDataEncoderBuilder r0 = r0.configureWith(r1)
            r1 = 1
            com.google.firebase.encoders.json.JsonDataEncoderBuilder r0 = r0.ignoreNullValues(r1)
            com.google.firebase.encoders.DataEncoder r0 = r0.build()
            return r0
    }

    public abstract java.util.List<com.google.android.datatransport.cct.internal.LogRequest> getLogRequests();
}
