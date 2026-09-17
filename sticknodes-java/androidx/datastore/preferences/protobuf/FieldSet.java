package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite;

/* loaded from: classes.dex */
final class FieldSet<T extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<T>> {
    private static final androidx.datastore.preferences.protobuf.FieldSet DEFAULT_INSTANCE = null;
    private final androidx.datastore.preferences.protobuf.SmallSortedMap<T, java.lang.Object> fields;
    private boolean hasLazyField;
    private boolean isImmutable;

    /* renamed from: androidx.datastore.preferences.protobuf.FieldSet$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType = null;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType = null;

        static {
                androidx.datastore.preferences.protobuf.WireFormat$FieldType[] r0 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.datastore.preferences.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType = r0
                r1 = 1
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r2 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.DOUBLE     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = androidx.datastore.preferences.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r3 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FLOAT     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = androidx.datastore.preferences.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r4 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT64     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                r3 = 4
                int[] r4 = androidx.datastore.preferences.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r5 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT64     // Catch: java.lang.NoSuchFieldError -> L33
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r4[r5] = r3     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                r4 = 5
                int[] r5 = androidx.datastore.preferences.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r6 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT32     // Catch: java.lang.NoSuchFieldError -> L3e
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r5[r6] = r4     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                r5 = 6
                int[] r6 = androidx.datastore.preferences.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L49
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r7 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED64     // Catch: java.lang.NoSuchFieldError -> L49
                int r7 = r7.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r6[r7] = r5     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                r6 = 7
                int[] r7 = androidx.datastore.preferences.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L54
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r8 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED32     // Catch: java.lang.NoSuchFieldError -> L54
                int r8 = r8.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r7[r8] = r6     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                r7 = 8
                int[] r8 = androidx.datastore.preferences.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L60
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r9 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.BOOL     // Catch: java.lang.NoSuchFieldError -> L60
                int r9 = r9.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r8[r9] = r7     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                r8 = 9
                int[] r9 = androidx.datastore.preferences.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L6c
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r10 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.GROUP     // Catch: java.lang.NoSuchFieldError -> L6c
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r9[r10] = r8     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r9 = androidx.datastore.preferences.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L78
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r10 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE     // Catch: java.lang.NoSuchFieldError -> L78
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r11 = 10
                r9[r10] = r11     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r9 = androidx.datastore.preferences.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L84
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r10 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.STRING     // Catch: java.lang.NoSuchFieldError -> L84
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> L84
                r11 = 11
                r9[r10] = r11     // Catch: java.lang.NoSuchFieldError -> L84
            L84:
                int[] r9 = androidx.datastore.preferences.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L90
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r10 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.BYTES     // Catch: java.lang.NoSuchFieldError -> L90
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> L90
                r11 = 12
                r9[r10] = r11     // Catch: java.lang.NoSuchFieldError -> L90
            L90:
                int[] r9 = androidx.datastore.preferences.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L9c
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r10 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT32     // Catch: java.lang.NoSuchFieldError -> L9c
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9c
                r11 = 13
                r9[r10] = r11     // Catch: java.lang.NoSuchFieldError -> L9c
            L9c:
                int[] r9 = androidx.datastore.preferences.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> La8
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r10 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED32     // Catch: java.lang.NoSuchFieldError -> La8
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> La8
                r11 = 14
                r9[r10] = r11     // Catch: java.lang.NoSuchFieldError -> La8
            La8:
                int[] r9 = androidx.datastore.preferences.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lb4
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r10 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED64     // Catch: java.lang.NoSuchFieldError -> Lb4
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb4
                r11 = 15
                r9[r10] = r11     // Catch: java.lang.NoSuchFieldError -> Lb4
            Lb4:
                int[] r9 = androidx.datastore.preferences.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lc0
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r10 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT32     // Catch: java.lang.NoSuchFieldError -> Lc0
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc0
                r11 = 16
                r9[r10] = r11     // Catch: java.lang.NoSuchFieldError -> Lc0
            Lc0:
                int[] r9 = androidx.datastore.preferences.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lcc
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r10 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT64     // Catch: java.lang.NoSuchFieldError -> Lcc
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lcc
                r11 = 17
                r9[r10] = r11     // Catch: java.lang.NoSuchFieldError -> Lcc
            Lcc:
                int[] r9 = androidx.datastore.preferences.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Ld8
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r10 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.ENUM     // Catch: java.lang.NoSuchFieldError -> Ld8
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> Ld8
                r11 = 18
                r9[r10] = r11     // Catch: java.lang.NoSuchFieldError -> Ld8
            Ld8:
                androidx.datastore.preferences.protobuf.WireFormat$JavaType[] r9 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                androidx.datastore.preferences.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType = r9
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r10 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.INT     // Catch: java.lang.NoSuchFieldError -> Le9
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> Le9
                r9[r10] = r1     // Catch: java.lang.NoSuchFieldError -> Le9
            Le9:
                int[] r1 = androidx.datastore.preferences.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch: java.lang.NoSuchFieldError -> Lf3
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r9 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.LONG     // Catch: java.lang.NoSuchFieldError -> Lf3
                int r9 = r9.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lf3
                r1[r9] = r0     // Catch: java.lang.NoSuchFieldError -> Lf3
            Lf3:
                int[] r0 = androidx.datastore.preferences.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch: java.lang.NoSuchFieldError -> Lfd
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r1 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.FLOAT     // Catch: java.lang.NoSuchFieldError -> Lfd
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lfd
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lfd
            Lfd:
                int[] r0 = androidx.datastore.preferences.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch: java.lang.NoSuchFieldError -> L107
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r1 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.DOUBLE     // Catch: java.lang.NoSuchFieldError -> L107
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L107
                r0[r1] = r3     // Catch: java.lang.NoSuchFieldError -> L107
            L107:
                int[] r0 = androidx.datastore.preferences.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch: java.lang.NoSuchFieldError -> L111
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r1 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.BOOLEAN     // Catch: java.lang.NoSuchFieldError -> L111
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L111
                r0[r1] = r4     // Catch: java.lang.NoSuchFieldError -> L111
            L111:
                int[] r0 = androidx.datastore.preferences.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch: java.lang.NoSuchFieldError -> L11b
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r1 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.STRING     // Catch: java.lang.NoSuchFieldError -> L11b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L11b
                r0[r1] = r5     // Catch: java.lang.NoSuchFieldError -> L11b
            L11b:
                int[] r0 = androidx.datastore.preferences.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch: java.lang.NoSuchFieldError -> L125
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r1 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.BYTE_STRING     // Catch: java.lang.NoSuchFieldError -> L125
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L125
                r0[r1] = r6     // Catch: java.lang.NoSuchFieldError -> L125
            L125:
                int[] r0 = androidx.datastore.preferences.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch: java.lang.NoSuchFieldError -> L12f
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r1 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.ENUM     // Catch: java.lang.NoSuchFieldError -> L12f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12f
                r0[r1] = r7     // Catch: java.lang.NoSuchFieldError -> L12f
            L12f:
                int[] r0 = androidx.datastore.preferences.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch: java.lang.NoSuchFieldError -> L139
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r1 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.MESSAGE     // Catch: java.lang.NoSuchFieldError -> L139
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L139
                r0[r1] = r8     // Catch: java.lang.NoSuchFieldError -> L139
            L139:
                return
        }
    }

    public interface FieldDescriptorLite<T extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<T>> extends java.lang.Comparable<T> {
        androidx.datastore.preferences.protobuf.WireFormat.JavaType getLiteJavaType();

        androidx.datastore.preferences.protobuf.WireFormat.FieldType getLiteType();

        int getNumber();

        androidx.datastore.preferences.protobuf.MessageLite.Builder internalMergeFrom(androidx.datastore.preferences.protobuf.MessageLite.Builder r1, androidx.datastore.preferences.protobuf.MessageLite r2);

        boolean isPacked();

        boolean isRepeated();
    }

    static {
            androidx.datastore.preferences.protobuf.FieldSet r0 = new androidx.datastore.preferences.protobuf.FieldSet
            r1 = 1
            r0.<init>(r1)
            androidx.datastore.preferences.protobuf.FieldSet.DEFAULT_INSTANCE = r0
            return
    }

    private FieldSet() {
            r1 = this;
            r1.<init>()
            r0 = 16
            androidx.datastore.preferences.protobuf.SmallSortedMap r0 = androidx.datastore.preferences.protobuf.SmallSortedMap.newFieldMap(r0)
            r1.fields = r0
            return
    }

    private FieldSet(androidx.datastore.preferences.protobuf.SmallSortedMap<T, java.lang.Object> r1) {
            r0 = this;
            r0.<init>()
            r0.fields = r1
            r0.makeImmutable()
            return
    }

    private FieldSet(boolean r1) {
            r0 = this;
            r1 = 0
            androidx.datastore.preferences.protobuf.SmallSortedMap r1 = androidx.datastore.preferences.protobuf.SmallSortedMap.newFieldMap(r1)
            r0.<init>(r1)
            r0.makeImmutable()
            return
    }

    private static java.lang.Object cloneIfMutable(java.lang.Object r3) {
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto Lf
            byte[] r3 = (byte[]) r3
            int r0 = r3.length
            byte[] r0 = new byte[r0]
            int r1 = r3.length
            r2 = 0
            java.lang.System.arraycopy(r3, r2, r0, r2, r1)
            return r0
        Lf:
            return r3
    }

    static int computeElementSize(androidx.datastore.preferences.protobuf.WireFormat.FieldType r1, int r2, java.lang.Object r3) {
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r2)
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r0 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.GROUP
            if (r1 != r0) goto La
            int r2 = r2 * 2
        La:
            int r1 = computeElementSizeNoTag(r1, r3)
            int r2 = r2 + r1
            return r2
    }

    static int computeElementSizeNoTag(androidx.datastore.preferences.protobuf.WireFormat.FieldType r1, java.lang.Object r2) {
            int[] r0 = androidx.datastore.preferences.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType
            int r1 = r1.ordinal()
            r1 = r0[r1]
            switch(r1) {
                case 1: goto Lee;
                case 2: goto Le3;
                case 3: goto Ld8;
                case 4: goto Lcd;
                case 5: goto Lc2;
                case 6: goto Lb7;
                case 7: goto Lac;
                case 8: goto La1;
                case 9: goto L9a;
                case 10: goto L88;
                case 11: goto L76;
                case 12: goto L64;
                case 13: goto L59;
                case 14: goto L4e;
                case 15: goto L43;
                case 16: goto L38;
                case 17: goto L2d;
                case 18: goto L13;
                default: goto Lb;
            }
        Lb:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "There is no way to get here, but the compiler thinks otherwise."
            r1.<init>(r2)
            throw r1
        L13:
            boolean r1 = r2 instanceof androidx.datastore.preferences.protobuf.Internal.EnumLite
            if (r1 == 0) goto L22
            androidx.datastore.preferences.protobuf.Internal$EnumLite r2 = (androidx.datastore.preferences.protobuf.Internal.EnumLite) r2
            int r1 = r2.getNumber()
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeEnumSizeNoTag(r1)
            return r1
        L22:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r1 = r2.intValue()
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeEnumSizeNoTag(r1)
            return r1
        L2d:
            java.lang.Long r2 = (java.lang.Long) r2
            long r1 = r2.longValue()
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeSInt64SizeNoTag(r1)
            return r1
        L38:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r1 = r2.intValue()
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeSInt32SizeNoTag(r1)
            return r1
        L43:
            java.lang.Long r2 = (java.lang.Long) r2
            long r1 = r2.longValue()
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeSFixed64SizeNoTag(r1)
            return r1
        L4e:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r1 = r2.intValue()
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeSFixed32SizeNoTag(r1)
            return r1
        L59:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r1 = r2.intValue()
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r1)
            return r1
        L64:
            boolean r1 = r2 instanceof androidx.datastore.preferences.protobuf.ByteString
            if (r1 == 0) goto L6f
            androidx.datastore.preferences.protobuf.ByteString r2 = (androidx.datastore.preferences.protobuf.ByteString) r2
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeBytesSizeNoTag(r2)
            return r1
        L6f:
            byte[] r2 = (byte[]) r2
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeByteArraySizeNoTag(r2)
            return r1
        L76:
            boolean r1 = r2 instanceof androidx.datastore.preferences.protobuf.ByteString
            if (r1 == 0) goto L81
            androidx.datastore.preferences.protobuf.ByteString r2 = (androidx.datastore.preferences.protobuf.ByteString) r2
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeBytesSizeNoTag(r2)
            return r1
        L81:
            java.lang.String r2 = (java.lang.String) r2
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeStringSizeNoTag(r2)
            return r1
        L88:
            boolean r1 = r2 instanceof androidx.datastore.preferences.protobuf.LazyField
            if (r1 == 0) goto L93
            androidx.datastore.preferences.protobuf.LazyField r2 = (androidx.datastore.preferences.protobuf.LazyField) r2
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeLazyFieldSizeNoTag(r2)
            return r1
        L93:
            androidx.datastore.preferences.protobuf.MessageLite r2 = (androidx.datastore.preferences.protobuf.MessageLite) r2
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeMessageSizeNoTag(r2)
            return r1
        L9a:
            androidx.datastore.preferences.protobuf.MessageLite r2 = (androidx.datastore.preferences.protobuf.MessageLite) r2
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeGroupSizeNoTag(r2)
            return r1
        La1:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r1 = r2.booleanValue()
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeBoolSizeNoTag(r1)
            return r1
        Lac:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r1 = r2.intValue()
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeFixed32SizeNoTag(r1)
            return r1
        Lb7:
            java.lang.Long r2 = (java.lang.Long) r2
            long r1 = r2.longValue()
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeFixed64SizeNoTag(r1)
            return r1
        Lc2:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r1 = r2.intValue()
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeInt32SizeNoTag(r1)
            return r1
        Lcd:
            java.lang.Long r2 = (java.lang.Long) r2
            long r1 = r2.longValue()
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt64SizeNoTag(r1)
            return r1
        Ld8:
            java.lang.Long r2 = (java.lang.Long) r2
            long r1 = r2.longValue()
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeInt64SizeNoTag(r1)
            return r1
        Le3:
            java.lang.Float r2 = (java.lang.Float) r2
            float r1 = r2.floatValue()
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeFloatSizeNoTag(r1)
            return r1
        Lee:
            java.lang.Double r2 = (java.lang.Double) r2
            double r1 = r2.doubleValue()
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeDoubleSizeNoTag(r1)
            return r1
    }

    public static int computeFieldSize(androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<?> r3, java.lang.Object r4) {
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r0 = r3.getLiteType()
            int r1 = r3.getNumber()
            boolean r2 = r3.isRepeated()
            if (r2 == 0) goto L4d
            boolean r3 = r3.isPacked()
            r2 = 0
            if (r3 == 0) goto L36
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r3 = r4.iterator()
        L1b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2b
            java.lang.Object r4 = r3.next()
            int r4 = computeElementSizeNoTag(r0, r4)
            int r2 = r2 + r4
            goto L1b
        L2b:
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r1)
            int r3 = r3 + r2
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeRawVarint32Size(r2)
            int r3 = r3 + r4
            return r3
        L36:
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r3 = r4.iterator()
        L3c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4c
            java.lang.Object r4 = r3.next()
            int r4 = computeElementSize(r0, r1, r4)
            int r2 = r2 + r4
            goto L3c
        L4c:
            return r2
        L4d:
            int r3 = computeElementSize(r0, r1, r4)
            return r3
    }

    public static <T extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<T>> androidx.datastore.preferences.protobuf.FieldSet<T> emptySet() {
            androidx.datastore.preferences.protobuf.FieldSet r0 = androidx.datastore.preferences.protobuf.FieldSet.DEFAULT_INSTANCE
            return r0
    }

    private int getMessageSetSerializedSize(java.util.Map.Entry<T, java.lang.Object> r5) {
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite r0 = (androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite) r0
            java.lang.Object r1 = r5.getValue()
            androidx.datastore.preferences.protobuf.WireFormat$JavaType r2 = r0.getLiteJavaType()
            androidx.datastore.preferences.protobuf.WireFormat$JavaType r3 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.MESSAGE
            if (r2 != r3) goto L44
            boolean r2 = r0.isRepeated()
            if (r2 != 0) goto L44
            boolean r2 = r0.isPacked()
            if (r2 != 0) goto L44
            boolean r0 = r1 instanceof androidx.datastore.preferences.protobuf.LazyField
            if (r0 == 0) goto L33
            java.lang.Object r5 = r5.getKey()
            androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite r5 = (androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite) r5
            int r5 = r5.getNumber()
            androidx.datastore.preferences.protobuf.LazyField r1 = (androidx.datastore.preferences.protobuf.LazyField) r1
            int r5 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeLazyFieldMessageSetExtensionSize(r5, r1)
            return r5
        L33:
            java.lang.Object r5 = r5.getKey()
            androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite r5 = (androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite) r5
            int r5 = r5.getNumber()
            androidx.datastore.preferences.protobuf.MessageLite r1 = (androidx.datastore.preferences.protobuf.MessageLite) r1
            int r5 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeMessageSetExtensionSize(r5, r1)
            return r5
        L44:
            int r5 = computeFieldSize(r0, r1)
            return r5
    }

    static int getWireFormatForFieldType(androidx.datastore.preferences.protobuf.WireFormat.FieldType r0, boolean r1) {
            if (r1 == 0) goto L4
            r0 = 2
            return r0
        L4:
            int r0 = r0.getWireType()
            return r0
    }

    private static <T extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<T>> boolean isInitialized(java.util.Map.Entry<T, java.lang.Object> r4) {
            java.lang.Object r0 = r4.getKey()
            androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite r0 = (androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite) r0
            androidx.datastore.preferences.protobuf.WireFormat$JavaType r1 = r0.getLiteJavaType()
            androidx.datastore.preferences.protobuf.WireFormat$JavaType r2 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.MESSAGE
            r3 = 1
            if (r1 != r2) goto L51
            boolean r0 = r0.isRepeated()
            r1 = 0
            if (r0 == 0) goto L33
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
        L20:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L51
            java.lang.Object r0 = r4.next()
            androidx.datastore.preferences.protobuf.MessageLite r0 = (androidx.datastore.preferences.protobuf.MessageLite) r0
            boolean r0 = r0.isInitialized()
            if (r0 != 0) goto L20
            return r1
        L33:
            java.lang.Object r4 = r4.getValue()
            boolean r0 = r4 instanceof androidx.datastore.preferences.protobuf.MessageLite
            if (r0 == 0) goto L44
            androidx.datastore.preferences.protobuf.MessageLite r4 = (androidx.datastore.preferences.protobuf.MessageLite) r4
            boolean r4 = r4.isInitialized()
            if (r4 != 0) goto L51
            return r1
        L44:
            boolean r4 = r4 instanceof androidx.datastore.preferences.protobuf.LazyField
            if (r4 == 0) goto L49
            return r3
        L49:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Wrong object type used with protocol message reflection."
            r4.<init>(r0)
            throw r4
        L51:
            return r3
    }

    private static boolean isValidType(androidx.datastore.preferences.protobuf.WireFormat.FieldType r2, java.lang.Object r3) {
            androidx.datastore.preferences.protobuf.Internal.checkNotNull(r3)
            int[] r0 = androidx.datastore.preferences.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType
            androidx.datastore.preferences.protobuf.WireFormat$JavaType r2 = r2.getJavaType()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L45;
                case 2: goto L42;
                case 3: goto L3f;
                case 4: goto L3c;
                case 5: goto L39;
                case 6: goto L36;
                case 7: goto L2b;
                case 8: goto L20;
                case 9: goto L15;
                default: goto L14;
            }
        L14:
            return r1
        L15:
            boolean r2 = r3 instanceof androidx.datastore.preferences.protobuf.MessageLite
            if (r2 != 0) goto L1f
            boolean r2 = r3 instanceof androidx.datastore.preferences.protobuf.LazyField
            if (r2 == 0) goto L1e
            goto L1f
        L1e:
            r0 = 0
        L1f:
            return r0
        L20:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L2a
            boolean r2 = r3 instanceof androidx.datastore.preferences.protobuf.Internal.EnumLite
            if (r2 == 0) goto L29
            goto L2a
        L29:
            r0 = 0
        L2a:
            return r0
        L2b:
            boolean r2 = r3 instanceof androidx.datastore.preferences.protobuf.ByteString
            if (r2 != 0) goto L35
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L34
            goto L35
        L34:
            r0 = 0
        L35:
            return r0
        L36:
            boolean r2 = r3 instanceof java.lang.String
            return r2
        L39:
            boolean r2 = r3 instanceof java.lang.Boolean
            return r2
        L3c:
            boolean r2 = r3 instanceof java.lang.Double
            return r2
        L3f:
            boolean r2 = r3 instanceof java.lang.Float
            return r2
        L42:
            boolean r2 = r3 instanceof java.lang.Long
            return r2
        L45:
            boolean r2 = r3 instanceof java.lang.Integer
            return r2
    }

    private void mergeFromField(java.util.Map.Entry<T, java.lang.Object> r5) {
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite r0 = (androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite) r0
            java.lang.Object r5 = r5.getValue()
            boolean r1 = r5 instanceof androidx.datastore.preferences.protobuf.LazyField
            if (r1 == 0) goto L14
            androidx.datastore.preferences.protobuf.LazyField r5 = (androidx.datastore.preferences.protobuf.LazyField) r5
            androidx.datastore.preferences.protobuf.MessageLite r5 = r5.getValue()
        L14:
            boolean r1 = r0.isRepeated()
            if (r1 == 0) goto L46
            java.lang.Object r1 = r4.getField(r0)
            if (r1 != 0) goto L25
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L25:
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r5 = r5.iterator()
        L2b:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L40
            java.lang.Object r2 = r5.next()
            r3 = r1
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = cloneIfMutable(r2)
            r3.add(r2)
            goto L2b
        L40:
            androidx.datastore.preferences.protobuf.SmallSortedMap<T extends androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r5 = r4.fields
            r5.put(r0, r1)
            goto L7d
        L46:
            androidx.datastore.preferences.protobuf.WireFormat$JavaType r1 = r0.getLiteJavaType()
            androidx.datastore.preferences.protobuf.WireFormat$JavaType r2 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.MESSAGE
            if (r1 != r2) goto L74
            java.lang.Object r1 = r4.getField(r0)
            if (r1 != 0) goto L5e
            androidx.datastore.preferences.protobuf.SmallSortedMap<T extends androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r4.fields
            java.lang.Object r5 = cloneIfMutable(r5)
            r1.put(r0, r5)
            goto L7d
        L5e:
            androidx.datastore.preferences.protobuf.MessageLite r1 = (androidx.datastore.preferences.protobuf.MessageLite) r1
            androidx.datastore.preferences.protobuf.MessageLite$Builder r1 = r1.toBuilder()
            androidx.datastore.preferences.protobuf.MessageLite r5 = (androidx.datastore.preferences.protobuf.MessageLite) r5
            androidx.datastore.preferences.protobuf.MessageLite$Builder r5 = r0.internalMergeFrom(r1, r5)
            androidx.datastore.preferences.protobuf.MessageLite r5 = r5.build()
            androidx.datastore.preferences.protobuf.SmallSortedMap<T extends androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r4.fields
            r1.put(r0, r5)
            goto L7d
        L74:
            androidx.datastore.preferences.protobuf.SmallSortedMap<T extends androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r4.fields
            java.lang.Object r5 = cloneIfMutable(r5)
            r1.put(r0, r5)
        L7d:
            return
    }

    public static <T extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<T>> androidx.datastore.preferences.protobuf.FieldSet<T> newFieldSet() {
            androidx.datastore.preferences.protobuf.FieldSet r0 = new androidx.datastore.preferences.protobuf.FieldSet
            r0.<init>()
            return r0
    }

    private void verifyType(androidx.datastore.preferences.protobuf.WireFormat.FieldType r1, java.lang.Object r2) {
            r0 = this;
            boolean r1 = isValidType(r1, r2)
            if (r1 == 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Wrong object type used with protocol message reflection."
            r1.<init>(r2)
            throw r1
    }

    static void writeElement(androidx.datastore.preferences.protobuf.CodedOutputStream r1, androidx.datastore.preferences.protobuf.WireFormat.FieldType r2, int r3, java.lang.Object r4) throws java.io.IOException {
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r0 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.GROUP
            if (r2 != r0) goto La
            androidx.datastore.preferences.protobuf.MessageLite r4 = (androidx.datastore.preferences.protobuf.MessageLite) r4
            r1.writeGroup(r3, r4)
            goto L15
        La:
            r0 = 0
            int r0 = getWireFormatForFieldType(r2, r0)
            r1.writeTag(r3, r0)
            writeElementNoTag(r1, r2, r4)
        L15:
            return
    }

    static void writeElementNoTag(androidx.datastore.preferences.protobuf.CodedOutputStream r1, androidx.datastore.preferences.protobuf.WireFormat.FieldType r2, java.lang.Object r3) throws java.io.IOException {
            int[] r0 = androidx.datastore.preferences.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType
            int r2 = r2.ordinal()
            r2 = r0[r2]
            switch(r2) {
                case 1: goto Ld2;
                case 2: goto Lc8;
                case 3: goto Lbe;
                case 4: goto Lb4;
                case 5: goto Laa;
                case 6: goto La0;
                case 7: goto L96;
                case 8: goto L8c;
                case 9: goto L86;
                case 10: goto L80;
                case 11: goto L70;
                case 12: goto L5e;
                case 13: goto L53;
                case 14: goto L48;
                case 15: goto L3d;
                case 16: goto L32;
                case 17: goto L27;
                case 18: goto Ld;
                default: goto Lb;
            }
        Lb:
            goto Ldb
        Ld:
            boolean r2 = r3 instanceof androidx.datastore.preferences.protobuf.Internal.EnumLite
            if (r2 == 0) goto L1c
            androidx.datastore.preferences.protobuf.Internal$EnumLite r3 = (androidx.datastore.preferences.protobuf.Internal.EnumLite) r3
            int r2 = r3.getNumber()
            r1.writeEnumNoTag(r2)
            goto Ldb
        L1c:
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.writeEnumNoTag(r2)
            goto Ldb
        L27:
            java.lang.Long r3 = (java.lang.Long) r3
            long r2 = r3.longValue()
            r1.writeSInt64NoTag(r2)
            goto Ldb
        L32:
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.writeSInt32NoTag(r2)
            goto Ldb
        L3d:
            java.lang.Long r3 = (java.lang.Long) r3
            long r2 = r3.longValue()
            r1.writeSFixed64NoTag(r2)
            goto Ldb
        L48:
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.writeSFixed32NoTag(r2)
            goto Ldb
        L53:
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.writeUInt32NoTag(r2)
            goto Ldb
        L5e:
            boolean r2 = r3 instanceof androidx.datastore.preferences.protobuf.ByteString
            if (r2 == 0) goto L69
            androidx.datastore.preferences.protobuf.ByteString r3 = (androidx.datastore.preferences.protobuf.ByteString) r3
            r1.writeBytesNoTag(r3)
            goto Ldb
        L69:
            byte[] r3 = (byte[]) r3
            r1.writeByteArrayNoTag(r3)
            goto Ldb
        L70:
            boolean r2 = r3 instanceof androidx.datastore.preferences.protobuf.ByteString
            if (r2 == 0) goto L7a
            androidx.datastore.preferences.protobuf.ByteString r3 = (androidx.datastore.preferences.protobuf.ByteString) r3
            r1.writeBytesNoTag(r3)
            goto Ldb
        L7a:
            java.lang.String r3 = (java.lang.String) r3
            r1.writeStringNoTag(r3)
            goto Ldb
        L80:
            androidx.datastore.preferences.protobuf.MessageLite r3 = (androidx.datastore.preferences.protobuf.MessageLite) r3
            r1.writeMessageNoTag(r3)
            goto Ldb
        L86:
            androidx.datastore.preferences.protobuf.MessageLite r3 = (androidx.datastore.preferences.protobuf.MessageLite) r3
            r1.writeGroupNoTag(r3)
            goto Ldb
        L8c:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.writeBoolNoTag(r2)
            goto Ldb
        L96:
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.writeFixed32NoTag(r2)
            goto Ldb
        La0:
            java.lang.Long r3 = (java.lang.Long) r3
            long r2 = r3.longValue()
            r1.writeFixed64NoTag(r2)
            goto Ldb
        Laa:
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.writeInt32NoTag(r2)
            goto Ldb
        Lb4:
            java.lang.Long r3 = (java.lang.Long) r3
            long r2 = r3.longValue()
            r1.writeUInt64NoTag(r2)
            goto Ldb
        Lbe:
            java.lang.Long r3 = (java.lang.Long) r3
            long r2 = r3.longValue()
            r1.writeInt64NoTag(r2)
            goto Ldb
        Lc8:
            java.lang.Float r3 = (java.lang.Float) r3
            float r2 = r3.floatValue()
            r1.writeFloatNoTag(r2)
            goto Ldb
        Ld2:
            java.lang.Double r3 = (java.lang.Double) r3
            double r2 = r3.doubleValue()
            r1.writeDoubleNoTag(r2)
        Ldb:
            return
    }

    public void addRepeatedField(T r3, java.lang.Object r4) {
            r2 = this;
            boolean r0 = r3.isRepeated()
            if (r0 == 0) goto L24
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r0 = r3.getLiteType()
            r2.verifyType(r0, r4)
            java.lang.Object r0 = r2.getField(r3)
            if (r0 != 0) goto L1e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.datastore.preferences.protobuf.SmallSortedMap<T extends androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r2.fields
            r1.put(r3, r0)
            goto L20
        L1e:
            java.util.List r0 = (java.util.List) r0
        L20:
            r0.add(r4)
            return
        L24:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "addRepeatedField() can only be called on repeated fields."
            r3.<init>(r4)
            throw r3
    }

    public androidx.datastore.preferences.protobuf.FieldSet<T> clone() {
            r4 = this;
            androidx.datastore.preferences.protobuf.FieldSet r0 = newFieldSet()
            r1 = 0
        L5:
            androidx.datastore.preferences.protobuf.SmallSortedMap<T extends androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r2 = r4.fields
            int r2 = r2.getNumArrayEntries()
            if (r1 >= r2) goto L23
            androidx.datastore.preferences.protobuf.SmallSortedMap<T extends androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r2 = r4.fields
            java.util.Map$Entry r2 = r2.getArrayEntryAt(r1)
            java.lang.Object r3 = r2.getKey()
            androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite r3 = (androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite) r3
            java.lang.Object r2 = r2.getValue()
            r0.setField(r3, r2)
            int r1 = r1 + 1
            goto L5
        L23:
            androidx.datastore.preferences.protobuf.SmallSortedMap<T extends androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r4.fields
            java.lang.Iterable r1 = r1.getOverflowEntries()
            java.util.Iterator r1 = r1.iterator()
        L2d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite r3 = (androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite) r3
            java.lang.Object r2 = r2.getValue()
            r0.setField(r3, r2)
            goto L2d
        L47:
            boolean r1 = r4.hasLazyField
            r0.hasLazyField = r1
            return r0
    }

    /* renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m6clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            androidx.datastore.preferences.protobuf.FieldSet r0 = r1.clone()
            return r0
    }

    java.util.Iterator<java.util.Map.Entry<T, java.lang.Object>> descendingIterator() {
            r2 = this;
            boolean r0 = r2.hasLazyField
            if (r0 == 0) goto L14
            androidx.datastore.preferences.protobuf.LazyField$LazyIterator r0 = new androidx.datastore.preferences.protobuf.LazyField$LazyIterator
            androidx.datastore.preferences.protobuf.SmallSortedMap<T extends androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r2.fields
            java.util.Set r1 = r1.descendingEntrySet()
            java.util.Iterator r1 = r1.iterator()
            r0.<init>(r1)
            return r0
        L14:
            androidx.datastore.preferences.protobuf.SmallSortedMap<T extends androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r2.fields
            java.util.Set r0 = r0.descendingEntrySet()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof androidx.datastore.preferences.protobuf.FieldSet
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            androidx.datastore.preferences.protobuf.FieldSet r2 = (androidx.datastore.preferences.protobuf.FieldSet) r2
            androidx.datastore.preferences.protobuf.SmallSortedMap<T extends androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r1.fields
            androidx.datastore.preferences.protobuf.SmallSortedMap<T extends androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r2 = r2.fields
            boolean r2 = r0.equals(r2)
            return r2
    }

    public java.lang.Object getField(T r2) {
            r1 = this;
            androidx.datastore.preferences.protobuf.SmallSortedMap<T extends androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r1.fields
            java.lang.Object r2 = r0.get(r2)
            boolean r0 = r2 instanceof androidx.datastore.preferences.protobuf.LazyField
            if (r0 == 0) goto L10
            androidx.datastore.preferences.protobuf.LazyField r2 = (androidx.datastore.preferences.protobuf.LazyField) r2
            androidx.datastore.preferences.protobuf.MessageLite r2 = r2.getValue()
        L10:
            return r2
    }

    public int getMessageSetSerializedSize() {
            r3 = this;
            r0 = 0
            r1 = 0
        L2:
            androidx.datastore.preferences.protobuf.SmallSortedMap<T extends androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r2 = r3.fields
            int r2 = r2.getNumArrayEntries()
            if (r0 >= r2) goto L18
            androidx.datastore.preferences.protobuf.SmallSortedMap<T extends androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r2 = r3.fields
            java.util.Map$Entry r2 = r2.getArrayEntryAt(r0)
            int r2 = r3.getMessageSetSerializedSize(r2)
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L2
        L18:
            androidx.datastore.preferences.protobuf.SmallSortedMap<T extends androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r3.fields
            java.lang.Iterable r0 = r0.getOverflowEntries()
            java.util.Iterator r0 = r0.iterator()
        L22:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            int r2 = r3.getMessageSetSerializedSize(r2)
            int r1 = r1 + r2
            goto L22
        L34:
            return r1
    }

    public int getSerializedSize() {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            androidx.datastore.preferences.protobuf.SmallSortedMap<T extends androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r2 = r4.fields
            int r2 = r2.getNumArrayEntries()
            if (r0 >= r2) goto L22
            androidx.datastore.preferences.protobuf.SmallSortedMap<T extends androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r2 = r4.fields
            java.util.Map$Entry r2 = r2.getArrayEntryAt(r0)
            java.lang.Object r3 = r2.getKey()
            androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite r3 = (androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite) r3
            java.lang.Object r2 = r2.getValue()
            int r2 = computeFieldSize(r3, r2)
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L2
        L22:
            androidx.datastore.preferences.protobuf.SmallSortedMap<T extends androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r4.fields
            java.lang.Iterable r0 = r0.getOverflowEntries()
            java.util.Iterator r0 = r0.iterator()
        L2c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L48
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite r3 = (androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite) r3
            java.lang.Object r2 = r2.getValue()
            int r2 = computeFieldSize(r3, r2)
            int r1 = r1 + r2
            goto L2c
        L48:
            return r1
    }

    public int hashCode() {
            r1 = this;
            androidx.datastore.preferences.protobuf.SmallSortedMap<T extends androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r1.fields
            int r0 = r0.hashCode()
            return r0
    }

    boolean isEmpty() {
            r1 = this;
            androidx.datastore.preferences.protobuf.SmallSortedMap<T extends androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r1.fields
            boolean r0 = r0.isEmpty()
            return r0
    }

    public boolean isImmutable() {
            r1 = this;
            boolean r0 = r1.isImmutable
            return r0
    }

    public boolean isInitialized() {
            r3 = this;
            r0 = 0
            r1 = 0
        L2:
            androidx.datastore.preferences.protobuf.SmallSortedMap<T extends androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r2 = r3.fields
            int r2 = r2.getNumArrayEntries()
            if (r1 >= r2) goto L1a
            androidx.datastore.preferences.protobuf.SmallSortedMap<T extends androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r2 = r3.fields
            java.util.Map$Entry r2 = r2.getArrayEntryAt(r1)
            boolean r2 = isInitialized(r2)
            if (r2 != 0) goto L17
            return r0
        L17:
            int r1 = r1 + 1
            goto L2
        L1a:
            androidx.datastore.preferences.protobuf.SmallSortedMap<T extends androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r3.fields
            java.lang.Iterable r1 = r1.getOverflowEntries()
            java.util.Iterator r1 = r1.iterator()
        L24:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            boolean r2 = isInitialized(r2)
            if (r2 != 0) goto L24
            return r0
        L37:
            r0 = 1
            return r0
    }

    public java.util.Iterator<java.util.Map.Entry<T, java.lang.Object>> iterator() {
            r2 = this;
            boolean r0 = r2.hasLazyField
            if (r0 == 0) goto L14
            androidx.datastore.preferences.protobuf.LazyField$LazyIterator r0 = new androidx.datastore.preferences.protobuf.LazyField$LazyIterator
            androidx.datastore.preferences.protobuf.SmallSortedMap<T extends androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r2.fields
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r0.<init>(r1)
            return r0
        L14:
            androidx.datastore.preferences.protobuf.SmallSortedMap<T extends androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r2.fields
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public void makeImmutable() {
            r1 = this;
            boolean r0 = r1.isImmutable
            if (r0 == 0) goto L5
            return
        L5:
            androidx.datastore.preferences.protobuf.SmallSortedMap<T extends androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r1.fields
            r0.makeImmutable()
            r0 = 1
            r1.isImmutable = r0
            return
    }

    public void mergeFrom(androidx.datastore.preferences.protobuf.FieldSet<T> r3) {
            r2 = this;
            r0 = 0
        L1:
            androidx.datastore.preferences.protobuf.SmallSortedMap<T extends androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r3.fields
            int r1 = r1.getNumArrayEntries()
            if (r0 >= r1) goto L15
            androidx.datastore.preferences.protobuf.SmallSortedMap<T extends androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r3.fields
            java.util.Map$Entry r1 = r1.getArrayEntryAt(r0)
            r2.mergeFromField(r1)
            int r0 = r0 + 1
            goto L1
        L15:
            androidx.datastore.preferences.protobuf.SmallSortedMap<T extends androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r3 = r3.fields
            java.lang.Iterable r3 = r3.getOverflowEntries()
            java.util.Iterator r3 = r3.iterator()
        L1f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r2.mergeFromField(r0)
            goto L1f
        L2f:
            return
    }

    public void setField(T r4, java.lang.Object r5) {
            r3 = this;
            boolean r0 = r4.isRepeated()
            if (r0 == 0) goto L34
            boolean r0 = r5 instanceof java.util.List
            if (r0 == 0) goto L2c
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r5 = (java.util.List) r5
            r0.addAll(r5)
            java.util.Iterator r5 = r0.iterator()
        L18:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r5.next()
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r2 = r4.getLiteType()
            r3.verifyType(r2, r1)
            goto L18
        L2a:
            r5 = r0
            goto L3b
        L2c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Wrong object type used with protocol message reflection."
            r4.<init>(r5)
            throw r4
        L34:
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r0 = r4.getLiteType()
            r3.verifyType(r0, r5)
        L3b:
            boolean r0 = r5 instanceof androidx.datastore.preferences.protobuf.LazyField
            if (r0 == 0) goto L42
            r0 = 1
            r3.hasLazyField = r0
        L42:
            androidx.datastore.preferences.protobuf.SmallSortedMap<T extends androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r3.fields
            r0.put(r4, r5)
            return
    }
}
