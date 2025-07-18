/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Copyright (c) [2025-2099] Martin (goudingcheng@gmail.com)
 */
package com.paohaijiao.javelin.executor;

import com.paohaijiao.javelin.antlr.impl.JAbstractAntlrExecutor;
import com.paohaijiao.javelin.model.JResult;
import com.paohaijiao.javelin.exception.JAntlrExecutionException;
import com.paohaijiao.javelin.parser.JQuickCurlLexer;
import com.paohaijiao.javelin.parser.JQuickCurlParser;
import com.paohaijiao.javelin.visitor.JQuickCurlCommonVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;

public class JQuickCurlExecutor extends JAbstractAntlrExecutor<String, JResult> {
    @Override
    protected Lexer createLexer(CharStream input) {
        return new JQuickCurlLexer(input);
    }

    @Override
    protected Parser createParser(TokenStream tokens) {
        return new JQuickCurlParser(tokens);
    }

    @Override
    protected JResult parse(Parser parser) throws JAntlrExecutionException {
        JQuickCurlParser calcParser = (JQuickCurlParser) parser;
        JQuickCurlParser.CurlCommandContext tree = calcParser.curlCommand();
        JQuickCurlCommonVisitor visitor = new JQuickCurlCommonVisitor();
        return visitor.visitCurlCommand(tree);
    }
}
