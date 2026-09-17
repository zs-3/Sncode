package com.mp4parser.iso14496.part15;

/* loaded from: classes2.dex */
public class AvcDecoderConfigurationRecord {
    public int avcLevelIndication;
    public int avcProfileIndication;
    public int bitDepthChromaMinus8;
    public int bitDepthChromaMinus8PaddingBits;
    public int bitDepthLumaMinus8;
    public int bitDepthLumaMinus8PaddingBits;
    public int chromaFormat;
    public int chromaFormatPaddingBits;
    public int configurationVersion;
    public boolean hasExts;
    public int lengthSizeMinusOne;
    public int lengthSizeMinusOnePaddingBits;
    public int numberOfSequenceParameterSetsPaddingBits;
    public java.util.List<byte[]> pictureParameterSets;
    public int profileCompatibility;
    public java.util.List<byte[]> sequenceParameterSetExts;
    public java.util.List<byte[]> sequenceParameterSets;

    public AvcDecoderConfigurationRecord() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.sequenceParameterSets = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.pictureParameterSets = r0
            r0 = 1
            r1.hasExts = r0
            r1.chromaFormat = r0
            r0 = 0
            r1.bitDepthLumaMinus8 = r0
            r1.bitDepthChromaMinus8 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.sequenceParameterSetExts = r0
            r0 = 63
            r1.lengthSizeMinusOnePaddingBits = r0
            r0 = 7
            r1.numberOfSequenceParameterSetsPaddingBits = r0
            r0 = 31
            r1.chromaFormatPaddingBits = r0
            r1.bitDepthLumaMinus8PaddingBits = r0
            r1.bitDepthChromaMinus8PaddingBits = r0
            return
    }

    public AvcDecoderConfigurationRecord(java.nio.ByteBuffer r12) {
            r11 = this;
            r11.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.sequenceParameterSets = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.pictureParameterSets = r0
            r0 = 1
            r11.hasExts = r0
            r11.chromaFormat = r0
            r0 = 0
            r11.bitDepthLumaMinus8 = r0
            r11.bitDepthChromaMinus8 = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r11.sequenceParameterSetExts = r1
            r1 = 63
            r11.lengthSizeMinusOnePaddingBits = r1
            r1 = 7
            r11.numberOfSequenceParameterSetsPaddingBits = r1
            r1 = 31
            r11.chromaFormatPaddingBits = r1
            r11.bitDepthLumaMinus8PaddingBits = r1
            r11.bitDepthChromaMinus8PaddingBits = r1
            int r1 = com.coremedia.iso.IsoTypeReader.readUInt8(r12)
            r11.configurationVersion = r1
            int r1 = com.coremedia.iso.IsoTypeReader.readUInt8(r12)
            r11.avcProfileIndication = r1
            int r1 = com.coremedia.iso.IsoTypeReader.readUInt8(r12)
            r11.profileCompatibility = r1
            int r1 = com.coremedia.iso.IsoTypeReader.readUInt8(r12)
            r11.avcLevelIndication = r1
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer r1 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer
            r1.<init>(r12)
            r2 = 6
            int r3 = r1.readBits(r2)
            r11.lengthSizeMinusOnePaddingBits = r3
            r3 = 2
            int r4 = r1.readBits(r3)
            r11.lengthSizeMinusOne = r4
            r4 = 3
            int r5 = r1.readBits(r4)
            r11.numberOfSequenceParameterSetsPaddingBits = r5
            r5 = 5
            int r1 = r1.readBits(r5)
            r6 = 0
        L69:
            if (r6 < r1) goto Lf4
            int r1 = com.coremedia.iso.IsoTypeReader.readUInt8(r12)
            long r7 = (long) r1
            r1 = 0
        L71:
            long r9 = (long) r1
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 < 0) goto Le2
            int r1 = r12.remaining()
            r6 = 4
            if (r1 >= r6) goto L7f
            r11.hasExts = r0
        L7f:
            boolean r1 = r11.hasExts
            if (r1 == 0) goto Lda
            int r1 = r11.avcProfileIndication
            r6 = 100
            if (r1 == r6) goto L95
            r6 = 110(0x6e, float:1.54E-43)
            if (r1 == r6) goto L95
            r6 = 122(0x7a, float:1.71E-43)
            if (r1 == r6) goto L95
            r6 = 144(0x90, float:2.02E-43)
            if (r1 != r6) goto Lda
        L95:
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer r1 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer
            r1.<init>(r12)
            int r2 = r1.readBits(r2)
            r11.chromaFormatPaddingBits = r2
            int r2 = r1.readBits(r3)
            r11.chromaFormat = r2
            int r2 = r1.readBits(r5)
            r11.bitDepthLumaMinus8PaddingBits = r2
            int r2 = r1.readBits(r4)
            r11.bitDepthLumaMinus8 = r2
            int r2 = r1.readBits(r5)
            r11.bitDepthChromaMinus8PaddingBits = r2
            int r1 = r1.readBits(r4)
            r11.bitDepthChromaMinus8 = r1
            int r1 = com.coremedia.iso.IsoTypeReader.readUInt8(r12)
            long r1 = (long) r1
        Lc3:
            long r3 = (long) r0
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 < 0) goto Lc9
            goto Le1
        Lc9:
            int r3 = com.coremedia.iso.IsoTypeReader.readUInt16(r12)
            byte[] r3 = new byte[r3]
            r12.get(r3)
            java.util.List<byte[]> r4 = r11.sequenceParameterSetExts
            r4.add(r3)
            int r0 = r0 + 1
            goto Lc3
        Lda:
            r12 = -1
            r11.chromaFormat = r12
            r11.bitDepthLumaMinus8 = r12
            r11.bitDepthChromaMinus8 = r12
        Le1:
            return
        Le2:
            int r6 = com.coremedia.iso.IsoTypeReader.readUInt16(r12)
            byte[] r6 = new byte[r6]
            r12.get(r6)
            java.util.List<byte[]> r9 = r11.pictureParameterSets
            r9.add(r6)
            int r1 = r1 + 1
            goto L71
        Lf4:
            int r7 = com.coremedia.iso.IsoTypeReader.readUInt16(r12)
            byte[] r7 = new byte[r7]
            r12.get(r7)
            java.util.List<byte[]> r8 = r11.sequenceParameterSets
            r8.add(r7)
            int r6 = r6 + 1
            goto L69
    }

    public void getContent(java.nio.ByteBuffer r8) {
            r7 = this;
            int r0 = r7.configurationVersion
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r8, r0)
            int r0 = r7.avcProfileIndication
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r8, r0)
            int r0 = r7.profileCompatibility
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r8, r0)
            int r0 = r7.avcLevelIndication
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r8, r0)
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer r0 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer
            r0.<init>(r8)
            int r1 = r7.lengthSizeMinusOnePaddingBits
            r2 = 6
            r0.writeBits(r1, r2)
            int r1 = r7.lengthSizeMinusOne
            r3 = 2
            r0.writeBits(r1, r3)
            int r1 = r7.numberOfSequenceParameterSetsPaddingBits
            r4 = 3
            r0.writeBits(r1, r4)
            java.util.List<byte[]> r1 = r7.pictureParameterSets
            int r1 = r1.size()
            r5 = 5
            r0.writeBits(r1, r5)
            java.util.List<byte[]> r0 = r7.sequenceParameterSets
            java.util.Iterator r0 = r0.iterator()
        L3b:
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto Lb9
            java.util.List<byte[]> r0 = r7.pictureParameterSets
            int r0 = r0.size()
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r8, r0)
            java.util.List<byte[]> r0 = r7.pictureParameterSets
            java.util.Iterator r1 = r0.iterator()
        L50:
            boolean r0 = r1.hasNext()
            if (r0 != 0) goto Lab
            boolean r0 = r7.hasExts
            if (r0 == 0) goto Laa
            int r0 = r7.avcProfileIndication
            r1 = 100
            if (r0 == r1) goto L6c
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 == r1) goto L6c
            r1 = 122(0x7a, float:1.71E-43)
            if (r0 == r1) goto L6c
            r1 = 144(0x90, float:2.02E-43)
            if (r0 != r1) goto Laa
        L6c:
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer r0 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer
            r0.<init>(r8)
            int r1 = r7.chromaFormatPaddingBits
            r0.writeBits(r1, r2)
            int r1 = r7.chromaFormat
            r0.writeBits(r1, r3)
            int r1 = r7.bitDepthLumaMinus8PaddingBits
            r0.writeBits(r1, r5)
            int r1 = r7.bitDepthLumaMinus8
            r0.writeBits(r1, r4)
            int r1 = r7.bitDepthChromaMinus8PaddingBits
            r0.writeBits(r1, r5)
            int r1 = r7.bitDepthChromaMinus8
            r0.writeBits(r1, r4)
            java.util.List<byte[]> r0 = r7.sequenceParameterSetExts
            java.util.Iterator r0 = r0.iterator()
        L95:
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L9c
            goto Laa
        L9c:
            java.lang.Object r1 = r0.next()
            byte[] r1 = (byte[]) r1
            int r2 = r1.length
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r8, r2)
            r8.put(r1)
            goto L95
        Laa:
            return
        Lab:
            java.lang.Object r0 = r1.next()
            byte[] r0 = (byte[]) r0
            int r6 = r0.length
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r8, r6)
            r8.put(r0)
            goto L50
        Lb9:
            java.lang.Object r1 = r0.next()
            byte[] r1 = (byte[]) r1
            int r6 = r1.length
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r8, r6)
            r8.put(r1)
            goto L3b
    }

    public long getContentSize() {
            r8 = this;
            java.util.List<byte[]> r0 = r8.sequenceParameterSets
            java.util.Iterator r0 = r0.iterator()
            r1 = 6
        L8:
            boolean r3 = r0.hasNext()
            r4 = 2
            if (r3 != 0) goto L5c
            r6 = 1
            long r1 = r1 + r6
            java.util.List<byte[]> r0 = r8.pictureParameterSets
            java.util.Iterator r3 = r0.iterator()
        L19:
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L51
            boolean r0 = r8.hasExts
            if (r0 == 0) goto L50
            int r0 = r8.avcProfileIndication
            r3 = 100
            if (r0 == r3) goto L35
            r3 = 110(0x6e, float:1.54E-43)
            if (r0 == r3) goto L35
            r3 = 122(0x7a, float:1.71E-43)
            if (r0 == r3) goto L35
            r3 = 144(0x90, float:2.02E-43)
            if (r0 != r3) goto L50
        L35:
            r6 = 4
            long r1 = r1 + r6
            java.util.List<byte[]> r0 = r8.sequenceParameterSetExts
            java.util.Iterator r0 = r0.iterator()
        L3e:
            boolean r3 = r0.hasNext()
            if (r3 != 0) goto L45
            goto L50
        L45:
            java.lang.Object r3 = r0.next()
            byte[] r3 = (byte[]) r3
            long r1 = r1 + r4
            int r3 = r3.length
            long r6 = (long) r3
            long r1 = r1 + r6
            goto L3e
        L50:
            return r1
        L51:
            java.lang.Object r0 = r3.next()
            byte[] r0 = (byte[]) r0
            long r1 = r1 + r4
            int r0 = r0.length
            long r6 = (long) r0
            long r1 = r1 + r6
            goto L19
        L5c:
            java.lang.Object r3 = r0.next()
            byte[] r3 = (byte[]) r3
            long r1 = r1 + r4
            int r3 = r3.length
            long r3 = (long) r3
            long r1 = r1 + r3
            goto L8
    }

    public java.lang.String[] getPPS() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<byte[]> r1 = r6.pictureParameterSets
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L1e
            int r1 = r0.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
        L1e:
            java.lang.Object r2 = r1.next()
            byte[] r2 = (byte[]) r2
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch: java.io.IOException -> L38
            int r4 = r2.length     // Catch: java.io.IOException -> L38
            r5 = 1
            int r4 = r4 - r5
            r3.<init>(r2, r5, r4)     // Catch: java.io.IOException -> L38
            com.googlecode.mp4parser.h264.model.PictureParameterSet r2 = com.googlecode.mp4parser.h264.model.PictureParameterSet.read(r3)     // Catch: java.io.IOException -> L38
            java.lang.String r2 = r2.toString()     // Catch: java.io.IOException -> L38
            r0.add(r2)
            goto Lb
        L38:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    public java.util.List<java.lang.String> getPictureParameterSetsAsStrings() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<byte[]> r1 = r3.pictureParameterSets
            int r1 = r1.size()
            r0.<init>(r1)
            java.util.List<byte[]> r1 = r3.pictureParameterSets
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L18
            return r0
        L18:
            java.lang.Object r2 = r1.next()
            byte[] r2 = (byte[]) r2
            java.lang.String r2 = com.coremedia.iso.Hex.encodeHex(r2)
            r0.add(r2)
            goto L11
    }

    public java.lang.String[] getSPS() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<byte[]> r1 = r7.sequenceParameterSets
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L1e
            int r1 = r0.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
        L1e:
            java.lang.Object r2 = r1.next()
            byte[] r2 = (byte[]) r2
            com.googlecode.mp4parser.authoring.tracks.CleanInputStream r3 = new com.googlecode.mp4parser.authoring.tracks.CleanInputStream     // Catch: java.io.IOException -> L3a
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch: java.io.IOException -> L3a
            int r5 = r2.length     // Catch: java.io.IOException -> L3a
            r6 = 1
            int r5 = r5 - r6
            r4.<init>(r2, r6, r5)     // Catch: java.io.IOException -> L3a
            r3.<init>(r4)     // Catch: java.io.IOException -> L3a
            com.googlecode.mp4parser.h264.model.SeqParameterSet r2 = com.googlecode.mp4parser.h264.model.SeqParameterSet.read(r3)     // Catch: java.io.IOException -> L3a
            java.lang.String r2 = r2.toString()     // Catch: java.io.IOException -> L3a
            goto L3c
        L3a:
            java.lang.String r2 = "not parsable"
        L3c:
            r0.add(r2)
            goto Lb
    }

    public java.util.List<java.lang.String> getSequenceParameterSetExtsAsStrings() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<byte[]> r1 = r3.sequenceParameterSetExts
            int r1 = r1.size()
            r0.<init>(r1)
            java.util.List<byte[]> r1 = r3.sequenceParameterSetExts
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L18
            return r0
        L18:
            java.lang.Object r2 = r1.next()
            byte[] r2 = (byte[]) r2
            java.lang.String r2 = com.coremedia.iso.Hex.encodeHex(r2)
            r0.add(r2)
            goto L11
    }

    public java.util.List<java.lang.String> getSequenceParameterSetsAsStrings() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<byte[]> r1 = r3.sequenceParameterSets
            int r1 = r1.size()
            r0.<init>(r1)
            java.util.List<byte[]> r1 = r3.sequenceParameterSets
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L18
            return r0
        L18:
            java.lang.Object r2 = r1.next()
            byte[] r2 = (byte[]) r2
            java.lang.String r2 = com.coremedia.iso.Hex.encodeHex(r2)
            r0.add(r2)
            goto L11
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AvcDecoderConfigurationRecord{configurationVersion="
            r0.<init>(r1)
            int r1 = r2.configurationVersion
            r0.append(r1)
            java.lang.String r1 = ", avcProfileIndication="
            r0.append(r1)
            int r1 = r2.avcProfileIndication
            r0.append(r1)
            java.lang.String r1 = ", profileCompatibility="
            r0.append(r1)
            int r1 = r2.profileCompatibility
            r0.append(r1)
            java.lang.String r1 = ", avcLevelIndication="
            r0.append(r1)
            int r1 = r2.avcLevelIndication
            r0.append(r1)
            java.lang.String r1 = ", lengthSizeMinusOne="
            r0.append(r1)
            int r1 = r2.lengthSizeMinusOne
            r0.append(r1)
            java.lang.String r1 = ", hasExts="
            r0.append(r1)
            boolean r1 = r2.hasExts
            r0.append(r1)
            java.lang.String r1 = ", chromaFormat="
            r0.append(r1)
            int r1 = r2.chromaFormat
            r0.append(r1)
            java.lang.String r1 = ", bitDepthLumaMinus8="
            r0.append(r1)
            int r1 = r2.bitDepthLumaMinus8
            r0.append(r1)
            java.lang.String r1 = ", bitDepthChromaMinus8="
            r0.append(r1)
            int r1 = r2.bitDepthChromaMinus8
            r0.append(r1)
            java.lang.String r1 = ", lengthSizeMinusOnePaddingBits="
            r0.append(r1)
            int r1 = r2.lengthSizeMinusOnePaddingBits
            r0.append(r1)
            java.lang.String r1 = ", numberOfSequenceParameterSetsPaddingBits="
            r0.append(r1)
            int r1 = r2.numberOfSequenceParameterSetsPaddingBits
            r0.append(r1)
            java.lang.String r1 = ", chromaFormatPaddingBits="
            r0.append(r1)
            int r1 = r2.chromaFormatPaddingBits
            r0.append(r1)
            java.lang.String r1 = ", bitDepthLumaMinus8PaddingBits="
            r0.append(r1)
            int r1 = r2.bitDepthLumaMinus8PaddingBits
            r0.append(r1)
            java.lang.String r1 = ", bitDepthChromaMinus8PaddingBits="
            r0.append(r1)
            int r1 = r2.bitDepthChromaMinus8PaddingBits
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
