package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MessageLite;

/* loaded from: classes.dex */
public abstract class AbstractParser<MessageType extends androidx.datastore.preferences.protobuf.MessageLite> implements androidx.datastore.preferences.protobuf.Parser<MessageType> {
    private static final androidx.datastore.preferences.protobuf.ExtensionRegistryLite EMPTY_REGISTRY = null;

    static {
            androidx.datastore.preferences.protobuf.ExtensionRegistryLite r0 = androidx.datastore.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            androidx.datastore.preferences.protobuf.AbstractParser.EMPTY_REGISTRY = r0
            return
    }

    public AbstractParser() {
            r0 = this;
            r0.<init>()
            return
    }

    private MessageType checkMessageInitialized(MessageType r2) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            r1 = this;
            if (r2 == 0) goto L16
            boolean r0 = r2.isInitialized()
            if (r0 == 0) goto L9
            goto L16
        L9:
            androidx.datastore.preferences.protobuf.UninitializedMessageException r0 = r1.newUninitializedMessageException(r2)
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = r0.asInvalidProtocolBufferException()
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r2 = r0.setUnfinishedMessage(r2)
            throw r2
        L16:
            return r2
    }

    private androidx.datastore.preferences.protobuf.UninitializedMessageException newUninitializedMessageException(MessageType r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.datastore.preferences.protobuf.AbstractMessageLite
            if (r0 == 0) goto Lb
            androidx.datastore.preferences.protobuf.AbstractMessageLite r2 = (androidx.datastore.preferences.protobuf.AbstractMessageLite) r2
            androidx.datastore.preferences.protobuf.UninitializedMessageException r2 = r2.newUninitializedMessageException()
            return r2
        Lb:
            androidx.datastore.preferences.protobuf.UninitializedMessageException r0 = new androidx.datastore.preferences.protobuf.UninitializedMessageException
            r0.<init>(r2)
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parseFrom(androidx.datastore.preferences.protobuf.ByteString r1, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r2) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            r0 = this;
            androidx.datastore.preferences.protobuf.MessageLite r1 = r0.parsePartialFrom(r1, r2)
            androidx.datastore.preferences.protobuf.MessageLite r1 = r0.checkMessageInitialized(r1)
            return r1
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseFrom(androidx.datastore.preferences.protobuf.ByteString r1, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r2) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            r0 = this;
            androidx.datastore.preferences.protobuf.MessageLite r1 = r0.parseFrom(r1, r2)
            return r1
    }

    public MessageType parsePartialFrom(androidx.datastore.preferences.protobuf.ByteString r2, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r3) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            r1 = this;
            androidx.datastore.preferences.protobuf.CodedInputStream r2 = r2.newCodedInput()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException -> L15
            java.lang.Object r3 = r1.parsePartialFrom(r2, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException -> L15
            androidx.datastore.preferences.protobuf.MessageLite r3 = (androidx.datastore.preferences.protobuf.MessageLite) r3     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException -> L15
            r0 = 0
            r2.checkLastTagWas(r0)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException -> Lf
            return r3
        Lf:
            r2 = move-exception
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r2 = r2.setUnfinishedMessage(r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException -> L15
            throw r2     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException -> L15
        L15:
            r2 = move-exception
            throw r2
    }
}
