package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractMessageLite;
import androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder;

/* loaded from: classes.dex */
public abstract class AbstractMessageLite<MessageType extends androidx.datastore.preferences.protobuf.AbstractMessageLite<MessageType, BuilderType>, BuilderType extends androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder<MessageType, BuilderType>> implements androidx.datastore.preferences.protobuf.MessageLite {
    protected int memoizedHashCode;

    public static abstract class Builder<MessageType extends androidx.datastore.preferences.protobuf.AbstractMessageLite<MessageType, BuilderType>, BuilderType extends androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder<MessageType, BuilderType>> implements androidx.datastore.preferences.protobuf.MessageLite.Builder {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        protected static <T> void addAll(java.lang.Iterable<T> r3, java.util.List<? super T> r4) {
                androidx.datastore.preferences.protobuf.Internal.checkNotNull(r3)
                boolean r0 = r3 instanceof androidx.datastore.preferences.protobuf.LazyStringList
                if (r0 == 0) goto L63
                androidx.datastore.preferences.protobuf.LazyStringList r3 = (androidx.datastore.preferences.protobuf.LazyStringList) r3
                java.util.List r3 = r3.getUnderlyingElements()
                r0 = r4
                androidx.datastore.preferences.protobuf.LazyStringList r0 = (androidx.datastore.preferences.protobuf.LazyStringList) r0
                int r4 = r4.size()
                java.util.Iterator r3 = r3.iterator()
            L18:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L70
                java.lang.Object r1 = r3.next()
                if (r1 != 0) goto L53
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r1 = "Element at index "
                r3.append(r1)
                int r1 = r0.size()
                int r1 = r1 - r4
                r3.append(r1)
                java.lang.String r1 = " is null."
                r3.append(r1)
                java.lang.String r3 = r3.toString()
                int r1 = r0.size()
                int r1 = r1 + (-1)
            L45:
                if (r1 < r4) goto L4d
                r0.remove(r1)
                int r1 = r1 + (-1)
                goto L45
            L4d:
                java.lang.NullPointerException r4 = new java.lang.NullPointerException
                r4.<init>(r3)
                throw r4
            L53:
                boolean r2 = r1 instanceof androidx.datastore.preferences.protobuf.ByteString
                if (r2 == 0) goto L5d
                androidx.datastore.preferences.protobuf.ByteString r1 = (androidx.datastore.preferences.protobuf.ByteString) r1
                r0.add(r1)
                goto L18
            L5d:
                java.lang.String r1 = (java.lang.String) r1
                r0.add(r1)
                goto L18
            L63:
                boolean r0 = r3 instanceof androidx.datastore.preferences.protobuf.PrimitiveNonBoxingCollection
                if (r0 == 0) goto L6d
                java.util.Collection r3 = (java.util.Collection) r3
                r4.addAll(r3)
                goto L70
            L6d:
                addAllCheckingNulls(r3, r4)
            L70:
                return
        }

        private static <T> void addAllCheckingNulls(java.lang.Iterable<T> r3, java.util.List<? super T> r4) {
                boolean r0 = r4 instanceof java.util.ArrayList
                if (r0 == 0) goto L1a
                boolean r0 = r3 instanceof java.util.Collection
                if (r0 == 0) goto L1a
                r0 = r4
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                int r1 = r4.size()
                r2 = r3
                java.util.Collection r2 = (java.util.Collection) r2
                int r2 = r2.size()
                int r1 = r1 + r2
                r0.ensureCapacity(r1)
            L1a:
                int r0 = r4.size()
                java.util.Iterator r3 = r3.iterator()
            L22:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L61
                java.lang.Object r1 = r3.next()
                if (r1 != 0) goto L5d
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r1 = "Element at index "
                r3.append(r1)
                int r1 = r4.size()
                int r1 = r1 - r0
                r3.append(r1)
                java.lang.String r1 = " is null."
                r3.append(r1)
                java.lang.String r3 = r3.toString()
                int r1 = r4.size()
                int r1 = r1 + (-1)
            L4f:
                if (r1 < r0) goto L57
                r4.remove(r1)
                int r1 = r1 + (-1)
                goto L4f
            L57:
                java.lang.NullPointerException r4 = new java.lang.NullPointerException
                r4.<init>(r3)
                throw r4
            L5d:
                r4.add(r1)
                goto L22
            L61:
                return
        }

        protected static androidx.datastore.preferences.protobuf.UninitializedMessageException newUninitializedMessageException(androidx.datastore.preferences.protobuf.MessageLite r1) {
                androidx.datastore.preferences.protobuf.UninitializedMessageException r0 = new androidx.datastore.preferences.protobuf.UninitializedMessageException
                r0.<init>(r1)
                return r0
        }

        protected abstract BuilderType internalMergeFrom(MessageType r1);

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(androidx.datastore.preferences.protobuf.MessageLite r2) {
                r1 = this;
                androidx.datastore.preferences.protobuf.MessageLite r0 = r1.getDefaultInstanceForType()
                java.lang.Class r0 = r0.getClass()
                boolean r0 = r0.isInstance(r2)
                if (r0 == 0) goto L15
                androidx.datastore.preferences.protobuf.AbstractMessageLite r2 = (androidx.datastore.preferences.protobuf.AbstractMessageLite) r2
                androidx.datastore.preferences.protobuf.AbstractMessageLite$Builder r2 = r1.internalMergeFrom(r2)
                return r2
            L15:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "mergeFrom(MessageLite) can only merge messages of the same type."
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(androidx.datastore.preferences.protobuf.MessageLite r1) {
                r0 = this;
                androidx.datastore.preferences.protobuf.AbstractMessageLite$Builder r1 = r0.mergeFrom(r1)
                return r1
        }
    }

    public AbstractMessageLite() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.memoizedHashCode = r0
            return
    }

    protected static <T> void addAll(java.lang.Iterable<T> r0, java.util.List<? super T> r1) {
            androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder.addAll(r0, r1)
            return
    }

    private java.lang.String getSerializingExceptionMessage(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Serializing "
            r0.append(r1)
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = " to a "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " threw an IOException (should never happen)."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    int getMemoizedSerializedSize() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    int getSerializedSize(androidx.datastore.preferences.protobuf.Schema r3) {
            r2 = this;
            int r0 = r2.getMemoizedSerializedSize()
            r1 = -1
            if (r0 != r1) goto Le
            int r0 = r3.getSerializedSize(r2)
            r2.setMemoizedSerializedSize(r0)
        Le:
            return r0
    }

    androidx.datastore.preferences.protobuf.UninitializedMessageException newUninitializedMessageException() {
            r1 = this;
            androidx.datastore.preferences.protobuf.UninitializedMessageException r0 = new androidx.datastore.preferences.protobuf.UninitializedMessageException
            r0.<init>(r1)
            return r0
    }

    void setMemoizedSerializedSize(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public androidx.datastore.preferences.protobuf.ByteString toByteString() {
            r3 = this;
            int r0 = r3.getSerializedSize()     // Catch: java.io.IOException -> L14
            androidx.datastore.preferences.protobuf.ByteString$CodedBuilder r0 = androidx.datastore.preferences.protobuf.ByteString.newCodedBuilder(r0)     // Catch: java.io.IOException -> L14
            androidx.datastore.preferences.protobuf.CodedOutputStream r1 = r0.getCodedOutput()     // Catch: java.io.IOException -> L14
            r3.writeTo(r1)     // Catch: java.io.IOException -> L14
            androidx.datastore.preferences.protobuf.ByteString r0 = r0.build()     // Catch: java.io.IOException -> L14
            return r0
        L14:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "ByteString"
            java.lang.String r2 = r3.getSerializingExceptionMessage(r2)
            r1.<init>(r2, r0)
            throw r1
    }

    public void writeTo(java.io.OutputStream r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.getSerializedSize()
            int r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.computePreferredBufferSize(r0)
            androidx.datastore.preferences.protobuf.CodedOutputStream r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.newInstance(r2, r0)
            r1.writeTo(r2)
            r2.flush()
            return
    }
}
