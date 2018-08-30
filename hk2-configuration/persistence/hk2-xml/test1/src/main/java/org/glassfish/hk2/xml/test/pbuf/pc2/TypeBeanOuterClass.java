/*
 * Copyright (c) 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: org/glassfish/hk2/xml/test/pbuf/pc2/TypeBean.proto

package org.glassfish.hk2.xml.test.pbuf.pc2;

public final class TypeBeanOuterClass {
  private TypeBeanOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TypeBeanOrBuilder extends
      // @@protoc_insertion_point(interface_extends:org.glassfish.hk2.xml.test.pbuf.pc2.TypeBean)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 int = 1;</code>
     */
    int getInt();

    /**
     * <code>int64 long = 2;</code>
     */
    long getLong();

    /**
     * <code>bool boolean = 3;</code>
     */
    boolean getBoolean();

    /**
     * <code>int32 byte = 4;</code>
     */
    int getByte();

    /**
     * <code>string char = 5;</code>
     */
    java.lang.String getChar();
    /**
     * <code>string char = 5;</code>
     */
    com.google.protobuf.ByteString
        getCharBytes();

    /**
     * <code>int32 short = 6;</code>
     */
    int getShort();

    /**
     * <code>float float = 7;</code>
     */
    float getFloat();

    /**
     * <code>double double = 8;</code>
     */
    double getDouble();

    /**
     * <code>string string = 9;</code>
     */
    java.lang.String getString();
    /**
     * <code>string string = 9;</code>
     */
    com.google.protobuf.ByteString
        getStringBytes();
  }
  /**
   * <pre>
   * Copyright (c) 2017 Oracle and/or its affiliates. All rights reserved.
   * This program and the accompanying materials are made available under the
   * terms of the Eclipse Public License v. 2.0, which is available at
   * http://www.eclipse.org/legal/epl-2.0.
   * This Source Code may also be made available under the following Secondary
   * Licenses when the conditions for such availability set forth in the
   * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
   * version 2 with the GNU Classpath Exception, which is available at
   * https://www.gnu.org/software/classpath/license.html.
   * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
   * </pre>
   *
   * Protobuf type {@code org.glassfish.hk2.xml.test.pbuf.pc2.TypeBean}
   */
  public  static final class TypeBean extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:org.glassfish.hk2.xml.test.pbuf.pc2.TypeBean)
      TypeBeanOrBuilder {
    // Use TypeBean.newBuilder() to construct.
    private TypeBean(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TypeBean() {
      int_ = 0;
      long_ = 0L;
      boolean_ = false;
      byte_ = 0;
      char_ = "";
      short_ = 0;
      float_ = 0F;
      double_ = 0D;
      string_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private TypeBean(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              int_ = input.readInt32();
              break;
            }
            case 16: {

              long_ = input.readInt64();
              break;
            }
            case 24: {

              boolean_ = input.readBool();
              break;
            }
            case 32: {

              byte_ = input.readInt32();
              break;
            }
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();

              char_ = s;
              break;
            }
            case 48: {

              short_ = input.readInt32();
              break;
            }
            case 61: {

              float_ = input.readFloat();
              break;
            }
            case 65: {

              double_ = input.readDouble();
              break;
            }
            case 74: {
              java.lang.String s = input.readStringRequireUtf8();

              string_ = s;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.internal_static_org_glassfish_hk2_xml_test_pbuf_pc2_TypeBean_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.internal_static_org_glassfish_hk2_xml_test_pbuf_pc2_TypeBean_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.TypeBean.class, org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.TypeBean.Builder.class);
    }

    public static final int INT_FIELD_NUMBER = 1;
    private int int_;
    /**
     * <code>int32 int = 1;</code>
     */
    public int getInt() {
      return int_;
    }

    public static final int LONG_FIELD_NUMBER = 2;
    private long long_;
    /**
     * <code>int64 long = 2;</code>
     */
    public long getLong() {
      return long_;
    }

    public static final int BOOLEAN_FIELD_NUMBER = 3;
    private boolean boolean_;
    /**
     * <code>bool boolean = 3;</code>
     */
    public boolean getBoolean() {
      return boolean_;
    }

    public static final int BYTE_FIELD_NUMBER = 4;
    private int byte_;
    /**
     * <code>int32 byte = 4;</code>
     */
    public int getByte() {
      return byte_;
    }

    public static final int CHAR_FIELD_NUMBER = 5;
    private volatile java.lang.Object char_;
    /**
     * <code>string char = 5;</code>
     */
    public java.lang.String getChar() {
      java.lang.Object ref = char_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        char_ = s;
        return s;
      }
    }
    /**
     * <code>string char = 5;</code>
     */
    public com.google.protobuf.ByteString
        getCharBytes() {
      java.lang.Object ref = char_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        char_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SHORT_FIELD_NUMBER = 6;
    private int short_;
    /**
     * <code>int32 short = 6;</code>
     */
    public int getShort() {
      return short_;
    }

    public static final int FLOAT_FIELD_NUMBER = 7;
    private float float_;
    /**
     * <code>float float = 7;</code>
     */
    public float getFloat() {
      return float_;
    }

    public static final int DOUBLE_FIELD_NUMBER = 8;
    private double double_;
    /**
     * <code>double double = 8;</code>
     */
    public double getDouble() {
      return double_;
    }

    public static final int STRING_FIELD_NUMBER = 9;
    private volatile java.lang.Object string_;
    /**
     * <code>string string = 9;</code>
     */
    public java.lang.String getString() {
      java.lang.Object ref = string_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        string_ = s;
        return s;
      }
    }
    /**
     * <code>string string = 9;</code>
     */
    public com.google.protobuf.ByteString
        getStringBytes() {
      java.lang.Object ref = string_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        string_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (int_ != 0) {
        output.writeInt32(1, int_);
      }
      if (long_ != 0L) {
        output.writeInt64(2, long_);
      }
      if (boolean_ != false) {
        output.writeBool(3, boolean_);
      }
      if (byte_ != 0) {
        output.writeInt32(4, byte_);
      }
      if (!getCharBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, char_);
      }
      if (short_ != 0) {
        output.writeInt32(6, short_);
      }
      if (float_ != 0F) {
        output.writeFloat(7, float_);
      }
      if (double_ != 0D) {
        output.writeDouble(8, double_);
      }
      if (!getStringBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 9, string_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (int_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, int_);
      }
      if (long_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, long_);
      }
      if (boolean_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, boolean_);
      }
      if (byte_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, byte_);
      }
      if (!getCharBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, char_);
      }
      if (short_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, short_);
      }
      if (float_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(7, float_);
      }
      if (double_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(8, double_);
      }
      if (!getStringBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(9, string_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.TypeBean)) {
        return super.equals(obj);
      }
      org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.TypeBean other = (org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.TypeBean) obj;

      boolean result = true;
      result = result && (getInt()
          == other.getInt());
      result = result && (getLong()
          == other.getLong());
      result = result && (getBoolean()
          == other.getBoolean());
      result = result && (getByte()
          == other.getByte());
      result = result && getChar()
          .equals(other.getChar());
      result = result && (getShort()
          == other.getShort());
      result = result && (
          java.lang.Float.floatToIntBits(getFloat())
          == java.lang.Float.floatToIntBits(
              other.getFloat()));
      result = result && (
          java.lang.Double.doubleToLongBits(getDouble())
          == java.lang.Double.doubleToLongBits(
              other.getDouble()));
      result = result && getString()
          .equals(other.getString());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + INT_FIELD_NUMBER;
      hash = (53 * hash) + getInt();
      hash = (37 * hash) + LONG_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getLong());
      hash = (37 * hash) + BOOLEAN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getBoolean());
      hash = (37 * hash) + BYTE_FIELD_NUMBER;
      hash = (53 * hash) + getByte();
      hash = (37 * hash) + CHAR_FIELD_NUMBER;
      hash = (53 * hash) + getChar().hashCode();
      hash = (37 * hash) + SHORT_FIELD_NUMBER;
      hash = (53 * hash) + getShort();
      hash = (37 * hash) + FLOAT_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getFloat());
      hash = (37 * hash) + DOUBLE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getDouble()));
      hash = (37 * hash) + STRING_FIELD_NUMBER;
      hash = (53 * hash) + getString().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.TypeBean parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.TypeBean parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.TypeBean parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.TypeBean parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.TypeBean parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.TypeBean parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.TypeBean parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.TypeBean parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.TypeBean parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.TypeBean parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.TypeBean parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.TypeBean parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.TypeBean prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Copyright (c) 2017 Oracle and/or its affiliates. All rights reserved.
     * This program and the accompanying materials are made available under the
     * terms of the Eclipse Public License v. 2.0, which is available at
     * http://www.eclipse.org/legal/epl-2.0.
     * This Source Code may also be made available under the following Secondary
     * Licenses when the conditions for such availability set forth in the
     * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
     * version 2 with the GNU Classpath Exception, which is available at
     * https://www.gnu.org/software/classpath/license.html.
     * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
     * </pre>
     *
     * Protobuf type {@code org.glassfish.hk2.xml.test.pbuf.pc2.TypeBean}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:org.glassfish.hk2.xml.test.pbuf.pc2.TypeBean)
        org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.TypeBeanOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.internal_static_org_glassfish_hk2_xml_test_pbuf_pc2_TypeBean_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.internal_static_org_glassfish_hk2_xml_test_pbuf_pc2_TypeBean_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.TypeBean.class, org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.TypeBean.Builder.class);
      }

      // Construct using org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.TypeBean.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        int_ = 0;

        long_ = 0L;

        boolean_ = false;

        byte_ = 0;

        char_ = "";

        short_ = 0;

        float_ = 0F;

        double_ = 0D;

        string_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.internal_static_org_glassfish_hk2_xml_test_pbuf_pc2_TypeBean_descriptor;
      }

      public org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.TypeBean getDefaultInstanceForType() {
        return org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.TypeBean.getDefaultInstance();
      }

      public org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.TypeBean build() {
        org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.TypeBean result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.TypeBean buildPartial() {
        org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.TypeBean result = new org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.TypeBean(this);
        result.int_ = int_;
        result.long_ = long_;
        result.boolean_ = boolean_;
        result.byte_ = byte_;
        result.char_ = char_;
        result.short_ = short_;
        result.float_ = float_;
        result.double_ = double_;
        result.string_ = string_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.TypeBean) {
          return mergeFrom((org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.TypeBean)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.TypeBean other) {
        if (other == org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.TypeBean.getDefaultInstance()) return this;
        if (other.getInt() != 0) {
          setInt(other.getInt());
        }
        if (other.getLong() != 0L) {
          setLong(other.getLong());
        }
        if (other.getBoolean() != false) {
          setBoolean(other.getBoolean());
        }
        if (other.getByte() != 0) {
          setByte(other.getByte());
        }
        if (!other.getChar().isEmpty()) {
          char_ = other.char_;
          onChanged();
        }
        if (other.getShort() != 0) {
          setShort(other.getShort());
        }
        if (other.getFloat() != 0F) {
          setFloat(other.getFloat());
        }
        if (other.getDouble() != 0D) {
          setDouble(other.getDouble());
        }
        if (!other.getString().isEmpty()) {
          string_ = other.string_;
          onChanged();
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.TypeBean parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.TypeBean) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int int_ ;
      /**
       * <code>int32 int = 1;</code>
       */
      public int getInt() {
        return int_;
      }
      /**
       * <code>int32 int = 1;</code>
       */
      public Builder setInt(int value) {

        int_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 int = 1;</code>
       */
      public Builder clearInt() {

        int_ = 0;
        onChanged();
        return this;
      }

      private long long_ ;
      /**
       * <code>int64 long = 2;</code>
       */
      public long getLong() {
        return long_;
      }
      /**
       * <code>int64 long = 2;</code>
       */
      public Builder setLong(long value) {

        long_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 long = 2;</code>
       */
      public Builder clearLong() {

        long_ = 0L;
        onChanged();
        return this;
      }

      private boolean boolean_ ;
      /**
       * <code>bool boolean = 3;</code>
       */
      public boolean getBoolean() {
        return boolean_;
      }
      /**
       * <code>bool boolean = 3;</code>
       */
      public Builder setBoolean(boolean value) {

        boolean_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool boolean = 3;</code>
       */
      public Builder clearBoolean() {

        boolean_ = false;
        onChanged();
        return this;
      }

      private int byte_ ;
      /**
       * <code>int32 byte = 4;</code>
       */
      public int getByte() {
        return byte_;
      }
      /**
       * <code>int32 byte = 4;</code>
       */
      public Builder setByte(int value) {

        byte_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 byte = 4;</code>
       */
      public Builder clearByte() {

        byte_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object char_ = "";
      /**
       * <code>string char = 5;</code>
       */
      public java.lang.String getChar() {
        java.lang.Object ref = char_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          char_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string char = 5;</code>
       */
      public com.google.protobuf.ByteString
          getCharBytes() {
        java.lang.Object ref = char_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          char_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string char = 5;</code>
       */
      public Builder setChar(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        char_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string char = 5;</code>
       */
      public Builder clearChar() {

        char_ = getDefaultInstance().getChar();
        onChanged();
        return this;
      }
      /**
       * <code>string char = 5;</code>
       */
      public Builder setCharBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        char_ = value;
        onChanged();
        return this;
      }

      private int short_ ;
      /**
       * <code>int32 short = 6;</code>
       */
      public int getShort() {
        return short_;
      }
      /**
       * <code>int32 short = 6;</code>
       */
      public Builder setShort(int value) {

        short_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 short = 6;</code>
       */
      public Builder clearShort() {

        short_ = 0;
        onChanged();
        return this;
      }

      private float float_ ;
      /**
       * <code>float float = 7;</code>
       */
      public float getFloat() {
        return float_;
      }
      /**
       * <code>float float = 7;</code>
       */
      public Builder setFloat(float value) {

        float_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float float = 7;</code>
       */
      public Builder clearFloat() {

        float_ = 0F;
        onChanged();
        return this;
      }

      private double double_ ;
      /**
       * <code>double double = 8;</code>
       */
      public double getDouble() {
        return double_;
      }
      /**
       * <code>double double = 8;</code>
       */
      public Builder setDouble(double value) {

        double_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double double = 8;</code>
       */
      public Builder clearDouble() {

        double_ = 0D;
        onChanged();
        return this;
      }

      private java.lang.Object string_ = "";
      /**
       * <code>string string = 9;</code>
       */
      public java.lang.String getString() {
        java.lang.Object ref = string_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          string_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string string = 9;</code>
       */
      public com.google.protobuf.ByteString
          getStringBytes() {
        java.lang.Object ref = string_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          string_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string string = 9;</code>
       */
      public Builder setString(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        string_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string string = 9;</code>
       */
      public Builder clearString() {

        string_ = getDefaultInstance().getString();
        onChanged();
        return this;
      }
      /**
       * <code>string string = 9;</code>
       */
      public Builder setStringBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        string_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:org.glassfish.hk2.xml.test.pbuf.pc2.TypeBean)
    }

    // @@protoc_insertion_point(class_scope:org.glassfish.hk2.xml.test.pbuf.pc2.TypeBean)
    private static final org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.TypeBean DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.TypeBean();
    }

    public static org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.TypeBean getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TypeBean>
        PARSER = new com.google.protobuf.AbstractParser<TypeBean>() {
      public TypeBean parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new TypeBean(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TypeBean> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TypeBean> getParserForType() {
      return PARSER;
    }

    public org.glassfish.hk2.xml.test.pbuf.pc2.TypeBeanOuterClass.TypeBean getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_glassfish_hk2_xml_test_pbuf_pc2_TypeBean_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_glassfish_hk2_xml_test_pbuf_pc2_TypeBean_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2org/glassfish/hk2/xml/test/pbuf/pc2/Ty" +
      "peBean.proto\022#org.glassfish.hk2.xml.test" +
      ".pbuf.pc2\"\220\001\n\010TypeBean\022\013\n\003int\030\001 \001(\005\022\014\n\004l" +
      "ong\030\002 \001(\003\022\017\n\007boolean\030\003 \001(\010\022\014\n\004byte\030\004 \001(\005" +
      "\022\014\n\004char\030\005 \001(\t\022\r\n\005short\030\006 \001(\005\022\r\n\005float\030\007" +
      " \001(\002\022\016\n\006double\030\010 \001(\001\022\016\n\006string\030\t \001(\tb\006pr" +
      "oto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_org_glassfish_hk2_xml_test_pbuf_pc2_TypeBean_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_glassfish_hk2_xml_test_pbuf_pc2_TypeBean_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_glassfish_hk2_xml_test_pbuf_pc2_TypeBean_descriptor,
        new java.lang.String[] { "Int", "Long", "Boolean", "Byte", "Char", "Short", "Float", "Double", "String", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
