package br.com.wallisson;

import lombok.*;

@RequiredArgsConstructor
@Getter
@Setter
public class Greeting {
    private final long id;
    private final String content;
}
