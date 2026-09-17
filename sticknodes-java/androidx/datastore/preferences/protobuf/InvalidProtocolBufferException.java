package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public class InvalidProtocolBufferException extends java.io.IOException {
    private androidx.datastore.preferences.protobuf.MessageLite unfinishedMessage;

    public static class InvalidWireTypeException extends androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        public InvalidWireTypeException(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public InvalidProtocolBufferException(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.unfinishedMessage = r1
            return
    }

    static androidx.datastore.preferences.protobuf.InvalidProtocolBufferException invalidEndTag() {
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException
            java.lang.String r1 = "Protocol message end-group tag did not match expected tag."
            r0.<init>(r1)
            return r0
    }

    static androidx.datastore.preferences.protobuf.InvalidProtocolBufferException invalidTag() {
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException
            java.lang.String r1 = "Protocol message contained an invalid tag (zero)."
            r0.<init>(r1)
            return r0
    }

    static androidx.datastore.preferences.protobuf.InvalidProtocolBufferException invalidUtf8() {
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException
            java.lang.String r1 = "Protocol message had invalid UTF-8."
            r0.<init>(r1)
            return r0
    }

    static androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException invalidWireType() {
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException
            java.lang.String r1 = "Protocol message tag had invalid wire type."
            r0.<init>(r1)
            return r0
    }

    static androidx.datastore.preferences.protobuf.InvalidProtocolBufferException malformedVarint() {
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException
            java.lang.String r1 = "CodedInputStream encountered a malformed varint."
            r0.<init>(r1)
            return r0
    }

    static androidx.datastore.preferences.protobuf.InvalidProtocolBufferException negativeSize() {
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException
            java.lang.String r1 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            r0.<init>(r1)
            return r0
    }

    static androidx.datastore.preferences.protobuf.InvalidProtocolBufferException parseFailure() {
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException
            java.lang.String r1 = "Failed to parse the message."
            r0.<init>(r1)
            return r0
    }

    static androidx.datastore.preferences.protobuf.InvalidProtocolBufferException recursionLimitExceeded() {
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException
            java.lang.String r1 = "Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit."
            r0.<init>(r1)
            return r0
    }

    static androidx.datastore.preferences.protobuf.InvalidProtocolBufferException sizeLimitExceeded() {
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException
            java.lang.String r1 = "Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit."
            r0.<init>(r1)
            return r0
    }

    static androidx.datastore.preferences.protobuf.InvalidProtocolBufferException truncatedMessage() {
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r0.<init>(r1)
            return r0
    }

    public androidx.datastore.preferences.protobuf.InvalidProtocolBufferException setUnfinishedMessage(androidx.datastore.preferences.protobuf.MessageLite r1) {
            r0 = this;
            r0.unfinishedMessage = r1
            return r0
    }
}
