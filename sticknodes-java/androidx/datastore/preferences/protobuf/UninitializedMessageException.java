package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public class UninitializedMessageException extends java.lang.RuntimeException {
    private final java.util.List<java.lang.String> missingFields;

    public UninitializedMessageException(androidx.datastore.preferences.protobuf.MessageLite r1) {
            r0 = this;
            java.lang.String r1 = "Message was missing required fields.  (Lite runtime could not determine which fields were missing)."
            r0.<init>(r1)
            r1 = 0
            r0.missingFields = r1
            return
    }

    public androidx.datastore.preferences.protobuf.InvalidProtocolBufferException asInvalidProtocolBufferException() {
            r2 = this;
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException
            java.lang.String r1 = r2.getMessage()
            r0.<init>(r1)
            return r0
    }
}
